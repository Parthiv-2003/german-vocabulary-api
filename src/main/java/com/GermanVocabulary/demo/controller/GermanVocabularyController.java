package com.instaanalytics.demo.controller;

import com.instaanalytics.demo.dto.VocabularyResponse;
import com.instaanalytics.demo.service.GermanVocabularyService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController 
@RequestMapping("/api/deutsch")
public class GermanVocabularyController {
    private final GermanVocabularyService vocabularyService;

    public GermanVocabularyController(GermanVocabularyService vocabularyService){
        this.vocabularyService = vocabularyService;
    }

    @GetMapping("/wortschatz")
    public ResponseEntity<List<VocabularyResponse>> getAllWortschtz(){
        return ResponseEntity.ok(vocabularyService.getAllVocabulary());
    }

    @GetMapping("/wortschatz/filter")
    public ResponseEntity<List<VocabularyResponse>> getWortschtzByNiveau(@RequestParam("niveau") String niveau){
        List<VocabularyResponse> result = vocabularyService.getVocabularyByNiveau(niveau);
        if(result.isEmpty()){
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(result);
    }
}
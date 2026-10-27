package com.instaanalytics.demo.dto;

import lombok.Data;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data 
@Builder
@NoArgsConstructor 
@AllArgsConstructor 
public class VocabularyResponse {
    
    private String wrot;
    private String niveau;
    private String definition;
    private String beispel;


}

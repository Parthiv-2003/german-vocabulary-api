package com.instaanalytics.demo.service;

import com.instaanalytics.demo.dto.VocabularyResponse;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service 
public class GermanVocabularyService {
    private final List<VocabularyResponse> vocabularyDatabase = List.of(
      new VocabularyResponse("das Wasser", "Easy", "Ein farbloses, klares Getränk, das man zum Leben braucht.", "Ich trinke jeden Tag viel Wasser."),
        new VocabularyResponse("die Sonne", "Easy", "Der helle Stern am Himmel, der Licht und Wärme gibt.", "Heute scheint die Sonne den ganzen Tag."),
        new VocabularyResponse("das Haus", "Easy", "Ein Gebäude, in dem Menschen wohnen.", "Wir wohnen in einem schönen Haus mit Garten."),
        new VocabularyResponse("essen", "Hunger haben", "feste Nahrung zu sich nehmen, um zu überleben.", "Um 13 Uhr essen wir zu Mittag."),
        new VocabularyResponse("schlafen", "Easy", "Sich ausruhen, während die Augen geschlossen sind und der Körper ruht.", "Nachts schlafe ich acht Stunden."),

        // --- A1 LEVEL (Anfänger / Goethe A1) ---
        new VocabularyResponse("der Termin", "A1", "Eine feste Vereinbarung für eine bestimmte Zeit.", "Ich habe morgen einen wichtigen Arzttermin."),
        new VocabularyResponse("die Fahrkarte", "A1", "Ein Ticket, das man für Bus, Bahn oder Zug braucht.", "Bitte kaufen Sie vor der Fahrt eine Fahrkarte."),
        new VocabularyResponse("die Bäckerei", "A1", "Ein Geschäft, in dem man Brot und Kuchen kaufen kann.", "Ich hole frische Brötchen aus der Bäckerei."),
        new VocabularyResponse("der Ausweis", "A1", "Ein offizielles Dokument mit Foto zur Personenkontrolle.", "Zeigen Sie bitte Ihren Personalausweis vor."),
        new VocabularyResponse("entschuldigen", "A1", "Um Verzeihung bitten oder höflich auf sich aufmerksam machen.", "Entschuldigung, wie komme ich zum Bahnhof?")
     );

     public List<VocabularyResponse> getAllVocabulary() {
        return vocabularyDatabase;
    }
     public List<VocabularyResponse> getVocabularyByNiveau(String niveau){
        return vocabularyDatabase.stream().filter(v -> v.getNiveau().equalsIgnoreCase(niveau)).collect(Collectors.toList());
     }
}

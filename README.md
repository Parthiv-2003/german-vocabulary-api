# 🇩🇪 German Vocabulary Learning API

A lightweight, native, and monolingual (German-only) Spring Boot backend application designed to provide an immersive vocabulary learning experience—progressing naturally from foundational terms to Goethe A1 level without English translation crutches.

---

## 🚀 Features

### Core Vocabulary Management
* **Monolingual Immersion:** Definitions, explanations, and context example sentences are provided entirely in German to encourage natural thinking in the target language.
* **Structured Proficiency Levels:** Curated vocabulary seamlessly progressing from **Easy** (Grundwortschatz) to **A1** (Goethe A1 beginner level).
* **Flexible REST Endpoints:** Clean endpoints allowing users to fetch the complete vocabulary database or filter words dynamically by level.

### Developer Experience
* **Clean Architecture:** Built using the standard Controller-Service-DTO pattern.
* **Boilerplate Reduction:** Leverages Project Lombok for clean and concise data models.
* **Quick Setup:** Standalone embedded server configuration ready for immediate local testing.

---

## 🏗️ Architecture

```text
┌─────────────────────────┐
│     Client Request      │
│ (Browser / Postman)     │
└────────────┬────────────┘
             │
             ▼
┌─────────────────────────┐
│ GermanVocabularyController │
└────────────┬────────────┘
             │
             ▼
┌─────────────────────────┐
│ GermanVocabularyService │
└────────────┬────────────┘
             │
             ▼
┌─────────────────────────┐
│ VocabularyResponse DTO  │
└────────────┬────────────┘
             │
             ▼
┌─────────────────────────┐
│ JSON Response to Client │
└─────────────────────────┘

📂 Project Structure
german-vocabulary-api
│
├── src
│   │
│   ├── main
│   │   │
│   │   ├── java
│   │   │   │
│   │   │   └── com
│   │   │       └── instaanalytics
│   │   │           └── demo
│   │   │               │
│   │   │               ├── DemoApplication.java
│   │   │               ├── controller
│   │   │               │   └── GermanVocabularyController.java
│   │   │               │
│   │   │               ├── dto
│   │   │               │   └── VocabularyResponse.java
│   │   │               │
│   │   │               └── service
│   │   │                   └── GermanVocabularyService.java
│   │   │
│   │   └── resources
│   │       └── application.properties
│
├── pom.xml
├── mvnw
├── mvnw.cmd
├── .gitignore
└── README.md
```
⚙️ Technology StackTechnologyPurpose
  Java 17  -  Backend Programming Language
  Spring Boot 3.2.x  -  Application Framework & REST API
  Lombok  -  Boilerplate Code Reduction
  Maven  -  Dependency Management & Build Tool
  Jackson  -  JSON Serialization & Processing

📡 API Endpoints Reference
1. Get All Vocabulary
URL: /api/deutsch/wortschatz

Method: GET

Description: Retrieves the entire curated German vocabulary dataset.

2. Filter Vocabulary by Level
URL: /api/deutsch/wortschatz/filter?niveau={level}

Method: GET

Parameters: niveau (e.g., Easy or A1)

Description: Returns only the words matching the specified difficulty level.

▶️ Running the Application
1. Clone the Repository
Bash
git clone [https://github.com/Parthiv-2003/german-vocabulary-api.git](https://github.com/Parthiv-2003/german-vocabulary-api.git)
cd german-vocabulary-api
2. Run Application
Linux / Git Bash:

Bash
./mvnw spring-boot:run
Windows (Command Prompt / PowerShell):

DOS
mvnw.cmd spring-boot:run
3. Open Browser or Postman
Test the endpoints at:

http://localhost:8080/api/deutsch/wortschatz

http://localhost:8080/api/deutsch/wortschatz/filter?niveau=A1

🎯 Future Enhancements
AI-Driven Word Generation: Integrating AI tools to dynamically generate new vocabulary, contextual variations, and advanced definitions on the fly.

Interactive Learning Paths: Adding user progress tracking, spaced repetition algorithms, and customizable difficulty scaling.

Expanded Content Levels: Scaling past A1 into A2, B1, and professional technical German.

👨‍💻 Author
Parthiv Tandel

Computer Science Graduate | Java Developer | Data Analytics Enthusiast

⭐ Support
If you found this project useful:

Star the repository

Fork the project

Submit feature requests

Create issues

Contribute improvements

Built with ❤️ using Spring Boot, Java, and a passion for language learning.

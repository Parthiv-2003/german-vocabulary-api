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


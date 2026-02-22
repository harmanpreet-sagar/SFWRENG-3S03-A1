# SFWRENG-3S03-A1

## Assignment 1 - Software Engineering 3S03

### Collaborators

- **Colin Chambachan** - chambacc - <Student Number\>
- **Harmanpreet Singh Sagar** - sagarh - 400436110
- **Jinwoo Hong** - hongj54 - 400433228

### Project Structure

```bash
SFWRENG-3S03-A1/
├── Q4/                   # Question 4: Test-Driven Development (TDD)
│   ├── pom.xml          # Q4 Maven configuration
│   ├── src/
│   │   ├── main/java/   # Q4 production code
│   │   └── test/java/   # Q4 test code
│   └── README.md        # Q4 documentation
├── Q5/                   # Question 5: (Test coverage and AI)
├── TDD_Process.md       # TDD methodology documentation
└── README.md            # This file
```

### Running Tests

Each question is completely independent with its own Maven configuration.

#### Q4 Tests

```bash
cd Q4
mvn clean test
```

### Prerequisites

- Java 11 or higher
- Maven 3.6 or higher

### Independence

Each question (Q4, Q5) operates independently:

- Separate `pom.xml` files
- Separate `src/` directories
- No shared dependencies or code
- Can be developed and tested in parallel

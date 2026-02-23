# SFWRENG-3S03-A1

## Assignment 1 - Software Engineering 3S03

### Collaborators

- **Colin Chambachan** - chambacc - 400449795
- **Harmanpreet Singh Sagar** - sagarh - 400436110
- **Jinwoo Hong** - hongj54 - 400433228

### Work Distribution

| Question | Part(s) | Assigned To |
|----------|---------|-------------|
| Q1 | All | Colin Chambachan |
| Q2 | All | Harmanpreet Singh Sagar |
| Q3 | All | Jinwoo Hong |
| Q4 | a, b | Harmanpreet Singh Sagar |
| Q4 | c, d | Colin Chambachan |
| Q4 | e, f | Jinwoo Hong |
| Q5 | a, c, d | Colin Chambachan |
| Q5 | b | Jinwoo Hong |

### Project Structure

```bash
SFWRENG-3S03-A1/
├── Q3/                     # Question 3: Catan Agent with JaCoCo Coverage
│   ├── pom.xml             # Q3 Maven configuration (JUnit + JaCoCo)
│   └── src/
│       └── main/java/
│           └── com/catan/  # Catan game implementation
├── Q4/                     # Question 4: Test-Driven Development (TDD)
│   ├── pom.xml             # Q4 Maven configuration (JUnit)
│   ├── src/
│   │   ├── main/java/      # Calculator production code
│   │   └── test/java/      # Calculator test code
│   └── README.md           # Q4 documentation
├── Q5/                     # Question 5: Shop Order System with Coverage
│   ├── pom.xml             # Q5 Maven configuration (JUnit + JaCoCo)
│   └── src/
│       ├── main/java/
│       │   └── com/example/shop/  # Order system implementation
│       └── test/java/
│           └── com/example/shop/  # Order system tests
├── .gitignore              # Git ignore file (excludes target/)
└── README.md               # This file
```

### Running Tests

Questions 3, 4, and 5 use Maven with independent configurations.

#### Q3 - Catan Agent (with JaCoCo Coverage)

```bash
cd Q3
mvn clean test

# View coverage report at:
# Q3/target/site/jacoco/index.html
```

#### Q4 - Test-Driven Development (TDD)

```bash
cd Q4
mvn clean test
```

#### Q5 - Shop Order System (with JaCoCo Coverage)

```bash
cd Q5
mvn clean test

# View coverage report at:
# Q5/target/site/jacoco/index.html
```

### Prerequisites

- Java 11 or higher
- Maven 3.6 or higher

### Coverage Reports

Q3 and Q5 use JaCoCo for code coverage analysis. After running tests, open the HTML report in your browser:

**Q3 Coverage:**

```bash
open Q3/target/site/jacoco/index.html
```

**Q5 Coverage:**

```bash
open Q5/target/site/jacoco/index.html
```

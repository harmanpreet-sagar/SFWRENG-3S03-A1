# Question 4: Test-Driven Development (TDD)

## Overview

This directory contains the solution for Question 4 - implementing a `divide()` method using TDD principles with at least two iterations and two unit tests per iteration.

## Project Structure

```bash
Q4/
├── pom.xml                      # Maven configuration
├── src/
│   ├── main/java/
│   │   └── Calculator.java      # Production code
│   └── test/java/
│       └── CalculatorTest.java  # Test suite (2 tests)
└── README.md                    # This file
```

## Running the Tests

### Prerequisites

- Java 11 or higher
- Maven 3.6 or higher

### Commands

```bash
# Navigate to Q4 directory
cd Q4

# Download dependencies and run all tests
mvn clean test

# Compile only
mvn compile

# Run tests only (after compilation)
mvn test
```

## TDD Iteration

### Iteration 1 - Q4a - Basic Functionality

- ✓ Test 1: `testDividePositiveNumbers()` - Division of positive integers (10 / 2 = 5)
- ✓ Test 2: `testDivideByZero()` - Exception handling for division by zero

## Test Results

```bash
Tests run: 2, Failures: 0, Errors: 0, Skipped: 0
BUILD SUCCESS
```

## Independence

This question is completely independent from Q5. Each question has its own:

- Maven configuration (`pom.xml`)
- Source directory (`src/`)
- Dependencies
- Build lifecycle

You can work on Q4 and Q5 simultaneously without any conflicts.

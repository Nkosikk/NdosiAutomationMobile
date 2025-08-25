# NdosiAutomationMobile

A Java-based mobile automation framework using Appium, Selenium, Cucumber, and TestNG. This project is structured for easy test development and reporting for Android applications.

---

## Project Structure

```
pom.xml
src/
  main/
    java/
    resources/
  test/
    java/
      Runners/
        RunnerTest.java
      Screens/
        HomeScreen.java
        LearningMaterialsScreen.java
        LandingScreen.java
      Steps/
        Hooks.java
        StepDefination.java
      Utils/
        AppiumDriverFactory.java
        DatabaseConnection.java
    resources/
      extent.properties
      Features/
        test.feature
```

---

## Key Components

- **AppiumDriverFactory.java**: Sets up and manages the Appium driver instance.
- **RunnerTest.java**: TestNG runner for executing Cucumber feature files, cucumber-reports and extentreports.
- **Hooks.java**: Cucumber hooks for actions like taking screenshots on failure.
- **StepDefinition.java**: Step definitions for Cucumber scenarios.
- **test.feature**: Sample feature file for BDD scenarios.
- **extent.properties**: Configuration for ExtentReports integration.

---

## Getting Started

### Prerequisites
- Java 21
- Maven
- Android SDK & emulator/device
- Appium server running (default: http://127.0.0.1:4723/)

---

### Setup
1. Clone the repository.
2. Install dependencies:
   ```sh
   mvn clean install
   ```
3. Start the Appium server.
4. Update the app path in `AppiumDriverFactory.java` if needed.

---

### Running Tests
Run all tests with:
```sh
mvn test
```

---

### Reports
- HTML and JSON reports: `target/cucumber-reports.html`, `target/cucumber.json`
- ExtentReports: Configured via `extent.properties`

---

## Dependencies
- Appium Java Client
- Selenium WebDriver
- Cucumber (Java, TestNG)
- TestNG
- ExtentReports Adapter

---

## Notes
- Feature files are located in `src/test/resources/Features/`.
- Step definitions and hooks are in `src/test/java/Steps/`.
- Update capabilities in `AppiumDriverFactory.java` as per your device/app.

---

Feel free to extend the framework for your specific mobile automation needs.


# JAVA RestAssured - API automation framework

1) Java library (API) for testing RESTful web services.
2) Used to test XML and JSON based web services.
3) Supports GET, POST, PUT, DELETE. Can be integrated with testing frameworks like JUnit, TestNG.

REST:

- Representation State Transfer is an architectural style sending the representational state of an object at that
  particular time. 
  JSON:
- Key value pair where key is always a String and Value can be String, number, boolean, JSON Object, JSON Array, null
  etc., - {} --> JSON Object - [] --> JSON Array

## Quick Start

	- Java
	- IntelliJ IDE
	- Maven
    - Cucumber
	- JUnit

## Project Map

### Runners

    The cucumber execution is done in this folder.
    MainRunner with CucumberOptions is used to create cucumber and json reports

### StepDefinitions

    This folder will be the place where the step definitions of the scenarios are made.
    Code should not be written in steps files. RestAssure fuctions must be called from the corresponding ApiUtils class.

### Utils

    ApiUtils class includes helper methods for API requests and responses.
    JsonReader class helps to extract Json files to make easy requests.
    PropertiesFile class helps to read properties.

### Data
    This file created to read and save .json and .xml files

### Features

    Approach to BDD style it helps to makes easy writing scenarios with Gherking Syntax.

### Config.properties

    It keeps fundamental properties like baseURL

### Pom.xml
  It utilizes required dependencies
    
    -cucumber-junit
    -cucumber-java
    -cucumber-picocontaine
    -slf4j-api
    -rest-assured
    -json-simple
    



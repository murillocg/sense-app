# Sense App
Web Application to find out the best place to go

## Main Technologies
- AWS
- Travis
- Docker
- Java 8
- Spring Boot 2.0
- Spring MVC
- MongoDB
- ReactJS

## Goals
- Work with technologies and patterns well-respected
- Programming using clean code, design patterns, tests and refactoring
- Follow the [Twelve-Factor App](http://12factor.net/) methodology to get a modern web application deployed properly
- Build a production application from the scratch

## Development

### To contribute with the project:
1. Fork the repository from [github](https://github.com/murillocg/sense-app)
2. Clone the fork
6. Run `SenseAppApplication.java` to start the app
7. Develop and do your pull request

### Code style
- Default Sun Java / Eclipse code style (a default config for eclipse can be found at the project root eclipse-rgb-format.xml).
- If you change only tiny things only reformat stuff you actually changed. Otherwise reviewing is really hard.
- We use spaces / 4 spaces as a tab in all files (java, xml...).
- Files in git repo should have unix (LF) file endings. We are using the .gitattributes file to handle that for you.
- All files are UTF-8.

### Running

    mvn spring-boot:run
# Content Calendar

## Overview

The Content Calendar application is a Spring Boot project designed to manage and organize content efficiently. It provides a set of endpoints to perform CRUD operations on content and integrates with various repositories.

## Project Structure


### `src/main/java/com/arjanaproject/contentcalendar/config/`

This directory contains configuration classes for the application, including properties management, custom configuration, and data initialization.

### `src/main/java/com/arjanaproject/contentcalendar/controller/`

This directory contains the controllers that handle HTTP requests and responses for various endpoints in the application.

### `src/main/java/com/arjanaproject/contentcalendar/model/`

This directory contains the data models or entities used in the application. These classes represent the structure of the data stored in the database.

### `src/main/java/com/arjanaproject/contentcalendar/repository/`

This directory includes repository interfaces for data access. It contains interfaces that define methods for interacting with the database using different strategies.

### `src/main/java/com/arjanaproject/contentcalendar/`

The root of the main application code. This directory includes the main application class that serves as the entry point for the Spring Boot application.

### `src/main/resources/`

This directory contains application resources such as configuration files, data files, and SQL scripts used for setting up the database schema.

### `src/test/java/com/arjanaproject/contentcalendar/`

This directory includes test classes for the application. It contains unit and integration tests for various components of the application.


## Setup and Run

1. **Clone the repository:**

    ```bash
    git clone https://github.com/ArjanaaTernava/ContentCalendar.git
    cd ContentCalendar
    ```

2. **Build the project using Maven:**

    ```bash
    ./mvnw clean install
    ```

3. **Run the application:**

    ```bash
    ./mvnw spring-boot:run
    ```

4. **Access the application:**

   The application will be available at [http://localhost:8080](http://localhost:8080).

## Technologies

- ![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=flat&logo=spring-boot&logoColor=white) Spring Boot
- ![PostgreSQL](https://img.shields.io/badge/PostgreSQL-4169E1?style=flat&logo=postgresql&logoColor=white) PostgreSQL
- ![Maven](https://img.shields.io/badge/Maven-C71A36?style=flat&logo=apache-maven&logoColor=white) Maven


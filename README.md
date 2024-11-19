# User CRUD API

This project is a User CRUD (Create, Read, Update, Delete) API built with Spring Boot, following the principles of Hexagonal Architecture (Ports and Adapters pattern). This architectural style helps achieve a clean separation between the core business logic and external dependencies, making the code more modular, maintainable, and testable.

## Features

- CRUD operations for managing user data (Create, Read, Update, Delete)
- Hexagonal Architecture (Ports & Adapters) for modular and decoupled code
- Persistence layer with JPA (or any other repository, easily switchable)
- RESTful endpoints with standardized responses

## Architecture Overview

The application is structured around Hexagonal Architecture, where:

- **Core Domain**: Contains business logic and domain entities.
- **Ports**: Define interfaces for the application's core to interact with the external world.
- **Adapters**: Implement the interfaces and handle the details of external dependencies (like databases or external APIs).
  
This separation allows for easy substitution of implementations, such as switching databases or adding new API interfaces, without changing the core logic.

## Requirements

- **Java 17** or higher
- **Maven** for build management

## Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/soufianebouaddis/Hexagonal-Architecture-Spring-Boot.git
   cd Hexagonal-Architecture-Spring-Boot
2. Clean install:
   ```bash
   mvn clean install
3. Run:
   ```bash
   mvn spring-boot:run

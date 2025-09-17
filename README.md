# Point of Sale System

A modular Point of Sale (POS) system developed as part of the Software Engineering course at the University of Tartu. The project demonstrates object-oriented programming principles and modular software architecture.

## Architecture

The system consists of three main components:

- **Core Module (pos)** - Business logic and data models
- **GUI Module (SaleSystemGUI)** - Graphical user interface
- **CLI Module (SaleSystemCLI)** - Command-line interface

## Features

- Sales transaction processing
- Product and inventory management
- Customer information management
- Sales reporting and analytics
- Dual interface support (GUI and CLI)

## Technology Stack

- **Language**: Java
- **Build System**: Gradle
- **GUI Framework**: JavaFX/Swing
- **Architecture**: Object-Oriented Programming

## Requirements

- Java Development Kit (JDK) 8 or higher
- Gradle or Gradle wrapper
- Java IDE (IntelliJ IDEA recommended)

## Installation

1. Clone the repository:
```bash
git clone https://github.com/jantomson/se-possystem.git
cd se-possystem
```

2. Import as a Gradle project in your IDE

3. Build the project:
```bash
./gradlew build
```

## Usage

### GUI Application
```bash
./gradlew :SaleSystemGUI:run
```

### CLI Application
```bash
./gradlew :SaleSystemCLI:run
```

## Project Structure

```
se-possystem/
├── pos/                 # Core business logic
├── SaleSystemGUI/       # Graphical interface
├── SaleSystemCLI/       # Command-line interface
└── build.gradle         # Build configuration
```

## Testing

```bash
./gradlew test
```

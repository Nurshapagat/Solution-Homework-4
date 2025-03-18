# Advanced Structural Patterns – Singleton & Adapter

# 📌 Overview
This project demonstrates the implementation of two important structural design patterns: Singleton and Adapter.

Singleton Pattern - Used to create a global configuration manager.

Adapter Pattern - Used to integrate a legacy chat service with a new interface.

# Part 1: Global Configuration Manager (Singleton Pattern)

**Objective**
Ensure that only one instance of ConfigurationManager exists throughout the application, providing centralized access to configuration settings.

**Implementation Details**
- ConfigurationManager class:
   - Implements the Singleton pattern.
   - Stores hardcoded key-value pairs for configuration settings.
   - Provides methods to retrieve configuration values and print all configurations.

- ConfigManagerDemo class:
   - Demonstrates accessing configuration values and printing all configurations.

# Part 2: Chat Service Adapter (Adapter Pattern)

**Objective**
Adapt the interface of a legacy chat service (LegacyChatService) to match the expected ChatService interface.

**Implementation Details**
- LegacyChatService class:
   - Simulates a legacy chat system with a method sendLegacyMessage(String msg).
- ChatService interface:
   - Defines a sendMessage(String message) method for the new chat system.
- ChatServiceAdapter class:
   - Adapts LegacyChatService to implement ChatService.
   - Calls sendLegacyMessage() when sendMessage() is invoked.
- ChatAdapterDemo class:
   - Demonstrates sending a message using the adapter.

# 📂 Project Structure
```bash
Solution-Homework-4
│── src/
│   ├── main/java/org/example/part_1/
│   │   ├── ConfigManagerDemo.java
│   │   ├── ConfigurationManager.java
│   ├── main/java/org/example/part_2/
│   │   ├── ChatAdapterDemo.java
│   │   ├── ChatService.java
│   │   ├── ChatServiceAdapter.java
│   │   ├── LegacyChatService.java
│── README.md

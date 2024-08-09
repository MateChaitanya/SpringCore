# 🌱 Spring Core - Practical Examples

Welcome to the **Spring Core** repository! This repository contains a collection of practical examples covering key concepts in Spring Framework, including Inversion of Control (IOC), Model-View-Controller (MVC), and Aspect-Oriented Programming (AOP). The examples are designed to help you understand and implement these concepts using annotations and best practices.

## 📂 Table of Contents

- [Introduction](#introduction)
- [IOC (Inversion of Control)](#-ioc-inversion-of-control)
- [MVC (Model-View-Controller)](#-mvc-model-view-controller)
- [AOP (Aspect-Oriented Programming)](#-aop-aspect-oriented-programming)
- [Annotations](#-annotations)


## 🌟 Introduction

Spring is a powerful and flexible framework that allows developers to build robust Java applications with ease. This repository covers essential aspects of Spring Core, focusing on practical implementations and real-world examples.

## 🔄 IOC (Inversion of Control)

### Overview
Inversion of Control (IOC) is a core concept in Spring, where the control of object creation and management is transferred from the application code to the Spring container.

### Key Concepts
- **Dependency Injection (DI):** Automatically injecting dependencies using constructors, setters, or field injection.
- **Bean Lifecycle:** Understanding the lifecycle of a Spring Bean, including initialization, destruction, and scopes.

### Practical Examples
- Creating and managing beans using annotations like `@Component`, `@Service`, `@Repository`, and `@Controller`.
- Configuring beans using `@Bean` and `@Configuration`.

## 🎨 MVC (Model-View-Controller)

### Overview
Spring MVC is a web framework built on the Model-View-Controller design pattern, enabling the development of web applications with a clear separation of concerns.

### Key Concepts
- **Model:** Represents the application data and business logic.
- **View:** Represents the user interface, typically rendered using JSP, Thymeleaf, or other templating engines.
- **Controller:** Handles user requests and returns the appropriate response.

### Practical Examples
- Setting up a simple Spring MVC project.
- Using `@Controller` and `@RequestMapping` to map HTTP requests to controller methods.
- Handling form submissions and validation using `@ModelAttribute` and `@Valid`.

## 🎯 AOP (Aspect-Oriented Programming)

### Overview
Aspect-Oriented Programming (AOP) allows you to modularize cross-cutting concerns, such as logging, security, and transaction management, by separating them from the business logic.

### Key Concepts
- **Aspect:** A module that encapsulates a cross-cutting concern.
- **Join Point:** A point in the application where an aspect can be applied (e.g., method execution).
- **Advice:** The action taken by an aspect at a particular join point.
- **Pointcut:** A set of join points where an aspect's advice should be applied.

### Practical Examples
- Implementing logging and security using `@Aspect` and `@Before`, `@After`, `@Around` annotations.
- Creating custom aspects for monitoring and performance tracking.

## 📝 Annotations

### Common Annotations Used
- `@Component`: Marks a class as a Spring component.
- `@Service`: Specialization of `@Component` for service layer.
- `@Repository`: Specialization of `@Component` for data access layer.
- `@Controller`: Marks a class as a Spring MVC controller.
- `@RequestMapping`: Maps HTTP requests to controller methods.
- `@Autowired`: Automatically injects dependencies.
- `@Aspect`: Marks a class as an aspect in AOP.

### Custom Annotations
- Creating and using custom annotations to enhance functionality and code readability.


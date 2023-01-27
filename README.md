# **user management system**

## ◽Description
this is implementation of base app for management system.

## ◽Features
- create user
- authorization
- get user
- get all users

## ◽Technologies
- Java 17
- Maven
- PostgreSQL
- Spring Web
- Spring Data
- Spring Boot

## ◽Quickstart
1. CREATE DATABASE with name user_management;
2. add your password and username to properties file

Example
>spring.datasource.url=jdbc:postgresql://localhost:5432/user_management
>spring.datasource.username=USERNAME
>spring.datasource.password=PASSWORD
>spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQL81Dialect

3. Run application
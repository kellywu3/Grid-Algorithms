# Maze Generator

## OVERVIEW

This Java program generates and displays a random maze.

## LIBRARIES/REQUIREMENTS

- [javax.swing JFrame](https://docs.oracle.com/javase/8/docs/api/javax/swing/JFrame.html)
- [javax.swing JPanel](https://docs.oracle.com/javase/8/docs/api/javax/swing/JPanel.html)

## TOOLS

[**Apache Maven**](https://maven.apache.org/download.cgi)
- build automation and project management tool

create maven project from archetype template project:
```shell
mvn archetype:generate 
```
clean maven project (delete target directory):
```shell
mvn clean
```
build maven project and install package files:
```shell
mvn install
```
build maven project and create JAR/WAR files:
```shell
mvn package
```

[**Apache Log4j**](https://logging.apache.org/log4j/2.x/)
- Java logging framework
- **loggers**: capture logs and pass records to handlers
- **handlers**: record log events and format message output

[**JUnit**](https://junit.org/junit5/)
- unit testing framework
- write and run repeatable automated tests

## CONCEPTS

**Publisher-Subscriber System**
- system of communication, allows for asynchronous messaging and separation between event publishers and event subscribers
- **publishers**: generate and send events to system
- **subscribers**: receive and process events from system
- **benefits**: allows management of many publishers, allows subscribers to listen to specific events

**Threads**
- execution path within a program
- allows allocation of time and/or performance resources amongst various tasks

**Interfaces**
- defines object behavior
- can contain abstract methods
- class can implement multiple interfaces
- **keywords**: interface, implements

**Abstractions**
- defines object type
- can contain abstract and non-abstract methods
- class can inherit one abstract class
- **keywords**: abstract, extends

**Is-A**
- inheritance of a class
- inheritance relationship between classes
- **keywords**: extends, implements

**Has-A**
- instance of class used in another class
- association relationship between classes, includes aggregation and composition
- **aggregation**: classes operate independently
- **composition**: classes operate dependently

## SOURCES

- [Executable Jar Files](https://www.baeldung.com/executable-jar-with-maven)
- 
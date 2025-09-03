# Online-marketplace-microservices-
spring boot project online marketplace microservices consist of  product management service and cart service


# How to run the application

## Setup development workspace

The setup development workspace process is simpler than ever with following steps:

1. Install JDK 17.
2. Install Maven
3. Install MySQL.
4. Clone this project to your local machine.
5. Open the pom.xml file and open as a project using Eclipse Spring Tool Suite 4


## Run a microservice

You can run Spring Boot microservice in different ways, but first make sure you are in the root directory of the microservice you want to run, running services sequentially, the order is discovery-service, config-server, product-service, shoppingcart-service and gateway

- Run jar file (of course you need to build it first): mvn install && java -jar target/<service-name>-1.0.0.jar
- Run with Spring Boot: mvn spring-boot:run

## Configuration

- create database mysql product_schema  with username=root and password=
- create database mysql shopping-schema  with username=root and password=

## Project folder structure 

Project folder structure
Based on above design, the project folder structure is organized following:

- config-server: Spring Cloud Config Server
- discovery-service:  Spring Cloud Eureka Server
- gateway: API Gateway
- product-service: Product Management Service
- shoppingcart-service: Cart Service

For each microservice, we will follow common 4 layers architecture:

- Controller: Handle HTTP request from client, invoke appropriate methods in service layer, return the result to client.
- Service: All business logic here. Data related calculations and all.
- Repository: all the Database related operations are done here.
- Entity: persistent domain object - table in Databases.

## API

  product-service :
  - Post : localhost:8888/products/addProducts

    ![Architecture](docs/images/diagram.pn)



  



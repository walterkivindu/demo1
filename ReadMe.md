# Getting Started

### Overview

This is a RESTful web service application built using spring boot.

#### Libraries used


* [Spring Boot Starter Web](https://spring.io/guides/tutorials/rest/). Exposes the application as a web or web service. 
  [maven dependency](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-web)
* [Lombok](https://projectlombok.org/). Assist in code generation to  minimizing boilerplate code. 
  [maven dependency](https://mvnrepository.com/artifact/org.projectlombok)
* [Spring Data JPA](https://spring.io/projects/spring-data-jpa).
  Help in managing relational data in spring application
  [maven dependency](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-data-jpa)
* [H2](http://www.h2database.com/html/main.html).
  Embedded and open-source database that integrates well with Java language.
  Since it is in-memory database, it suits this situation.
  [maven dependency](https://mvnrepository.com/artifact/com.h2database/h2)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/1.5.16.RELEASE/reference/html/using-boot-devtools.html).
    This helps in hot-reload when coding as you test the application.
  [maven dependency](https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-devtools)


The application start by adding some seed data for each entity.

### Application endpoints
> #### Client
> ***GET*** <br>
> <br>
http://localhost:8080/clients <br>
> Gives a list all clients <br>
> e.g <br>
> ![All](images/clients-all.PNG)
> <br><br>
> http://localhost:8080/clients/{id} <br>
> Returns the client whose id is as specified <br>
> e.g <br>
> ![Client](images/clients-speciic.PNG) <br><br>
> > ***POST***
> <br><br>
http://localhost:8080/clients <br>
> Adds a new client <br>
> e.g <br>
> ![New](images/clients-add.PNG)
> 
> > #### Branch
> ***GET*** <br>
> <br>
http://localhost:8080/branches <br>
> Gives a list all country-branches <br>
> e.g <br>
> ![All](images/branches-all.PNG)
> <br><br>
> http://localhost:8080/branches/{id} <br>
> Returns the country-branch whose id is as specified <br>
> e.g <br>
> ![Branch](images/branches-specific.PNG)<br><br>
> ***POST***
> <br><br>
http://localhost:8080/branches <br>
> Adds a new country-branch <br>
> e.g <br>
> ![New](images/branches-add.PNG)
>
> > #### Device
> ***GET*** <br>
> <br>
http://localhost:8080/devices <br>
> Gives a list all available devices <br>
> e.g <br>
> ![All](images/devices-all.PNG)
> <br><br>
> http://localhost:8080/devices/{serial} <br>
> Returns the device whose serial number is as specified <br>
> e.g <br>
> ![Device](images/devices-specific.PNG) <br><br>
> > ***POST***
> <br><br>
http://localhost:8080/devices <br>
> Adds a new device <br>
> e.g <br>
> ![New](images/devices-add.PNG)

>
> > #### Country
> ***GET*** <br>
> <br>
http://localhost:8080/countries <br>
> Gives a list all available countries <br>
> e.g <br>
> ![All](images/countries-all.PNG)
> <br><br>
> http://localhost:8080/countries/{code} <br>
> Returns the country whose code is as specified <br>
> e.g <br>
> ![Country](images/countries-specific.PNG)<br><br>
> > ***POST***
> <br><br>
http://localhost:8080/countries <br>
> Adds a new country <br>
> e.g <br>
> ![New](images/countries-add.PNG)


### Why choose H2?
* H2 is a relational database as stated in the instructions.
* H2 is embedded database thus it runs on same JVM where the application is deployed.
* H2 has a small footprint. It won't significantly increase the size of the application bundle.
* H2 is witten in Java. Therefore, it integrates well with JVM languages. Also, it is automatically configured by spring boot application.
* H2 is in-memory which means it maintains the same size after application restart.






# Getting Started
GET - dohvat podataka (search)
POST - kreiranje novih entiteta (kada nemamo PK, CREATE)
PUT - Update ili kreiranje ako imamo PK
DELETE - brisanje

PATCH - djelomični update

URL:
GET  - /groups
GET  - /groups/{groupName}
POST - /groups - body json GroupDTO
PUT - /groups/{groupName} body json GroupDTO
DELETE - /groups/{groupName}


http code 200 -  uspješna operacija
http code 204 -  uspješna operacija bez povratnih podataka


Group - vsite

/groups/vsite
### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.2.2/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.2.2/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.2.2/reference/htmlsingle/index.html#web)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/3.2.2/reference/htmlsingle/index.html#data.sql.jpa-and-spring-data)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Spring data query methods](https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html)
* [Testing the Web Layer](https://spring.io/guides/gs/testing-web/)
* [Building a RESTful Web Service with Spring Boot Actuator](https://spring.io/guides/gs/actuator-service/)
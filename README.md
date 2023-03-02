# ClientService

The folder contains a maven project named `demo`.

It consists of 2 modules:
  `demo-service`
  `demo-specification`

`demo-service`: This sub-module is responsible to spin-off the Spring Boot Web application.
`demo-specification`: This sub-module is responsible to create the REST api specifications.

Setting up the environment:
  1) PostgreSQL must be setup either locally or in a remote server.
  2) The datasource details must be provided in the `application.properties` file under the path `demo/demo-service/src/main/resources/application.properties` - 
  For example:
    `spring.datasource.url=jdbc:postgresql://localhost:5432/test`
    `spring.datasource.username=postgres`
    `spring.datasource.password=postgres`
  
  3) The maven project must be build using `mvn clean install`, either through an IDE or directly from command line.
  4) Once the build is successful, the sub-module `demo-service` creates a "war" file named: `demo-service-1.0.0.war` which can be found under the "target" folder inside the "demo-service" module generated after the maven build. 
  
  NOTE:
  1) The json file - "ClientData.json" file is passed as a program argument while running the application
  
  
To run the application:
  1) The application can be started either from the IDE - By running the "DemoServiceApplication" with the Program argument - path to the json file.
  or directly from the command line -  `java -jar demo-service-1.0.0.war <pathToJsonFile>`
  For example:
    `java -jar demo-service-1.0.0.war /Users/ayan/IdeaProjects/demo/demo-service/src/main/resources/ClientData.json`
    
  The application will start running after that.
  
  A postman collection is also attached to this changelist so that the APIs can be tested seemlessly.
    
    
  

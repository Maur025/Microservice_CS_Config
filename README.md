Microservicio 1: Config
Tecnologías Utilizadas:
SpringBoot (Versión 3.2.0)
Java (Versión 17.+.+) Compatible con la version de SpringBoot
postgresSql (Version 16)

Instrucciones de Ejecución:
primero abre el proyecto en el ide de java, eso hara que se reconozca el proyecto y maven instale las dependencias.
Crea una base de datos con el nombre "customer_support_clientDb".
Crea otra base de datos con el nombre "customer_support_vehicleDb".
Realiza la ejecucion de los Microservicios en el siguiente orden:

Config
Eureka
Client
Vehicle
Gateway

API Endpoint:
Endpoint de Cliente: http://localhost:8090/api/client/
Endpoint de Vehicle: http://localhost:9090/api/vehicle/

Endpoint de Eureka: http://localhost:8761/eureka

Endpoint del gateway: http://localhost:8080/

Las consultas desde un cliente deben realizarse por el endpoint del gateway, en el cual solo se le configuro en cors a la url http://localhost:4200 perteneciente a una aplicacion Angular, en caso de que quiera ser editado se encuentra en la configuracion del microservicio de gateway, en src/main/java/com/customersupport/gateway/config/CorsConfig.java.

Los links a los otros microservicios seran agregados proximamente en esta seccion:

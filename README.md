# Microservicio 1 - Config

## Tecnologías Utilizadas:

SpringBoot (Versión 3.2.0)<br>
Java (Versión 17.+.+) Compatible con la version de SpringBoot<br>
postgresSql (Version 16.+)<br>

## Instrucciones de Ejecución:

Ejecuta el proyecto en el IDE de java (de tu preferencia), eso hara que se reconozca el proyecto y maven instale las dependencias. <br>
Crea una base de datos con el nombre "customer_support_clientDb". <br>
Crea otra base de datos con el nombre "customer_support_vehicleDb".<br>

### Realiza la ejecucion de los Microservicios en el siguiente orden:

- Config (actual)
- Eureka
- Client
- Vehicle
- Gateway

## API Endpoint:

Endpoint de Cliente: http://localhost:8090/api/client/<br>
Endpoint de Vehicle: http://localhost:9090/api/vehicle/<br>
<br>
Endpoint de Eureka: http://localhost:8761/eureka
<br>
<br>
Endpoint del gateway: http://localhost:8080/
<br>
<br>
Las consultas desde un cliente deben realizarse por el endpoint del gateway, en el cual solo se le configuro en cors a la url http://localhost:4200 perteneciente a una aplicacion Angular, en caso de que quiera ser editado se encuentra en la configuracion del microservicio de gateway, en src/main/java/com/customersupport/gateway/config/CorsConfig.java.
<br>
<br>

## Enlaces de los otros microservicios:

eureka-url: https://github.com/Maur025/Microservice_CS_eureka.git<br>
client-url: https://github.com/Maur025/Microservice_CS_Client.git<br>
vehicle-url: https://github.com/Maur025/Miroservice_CS_vehicle.git<br>
gateway-url: https://github.com/Maur025/Microservice_CS_gateway.git<br>

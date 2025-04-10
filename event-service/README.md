## Configuration Notes

If running manually, use docker to run **RabbitMQ**

```
docker run -d --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3-management

```

If using **Docker Compose**, use service names (not localhost) in `application.properties`

```
eureka.client.service-url.defaultZone=http://eureka-server:8761/eureka/
eureka.instance.hostname=event-service

spring.rabbitmq.host=rabbitmq

```

If running manually, use localhost in `application.properties`

```
eureka.client.service-url.defaultZone=http://localhost:8761/eureka/
eureka.instance.hostname=localhost

spring.rabbitmq.host=localhost

```

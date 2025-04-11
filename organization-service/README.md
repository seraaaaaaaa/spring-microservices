## Configuration Notes

If using **Docker Compose**, use service names (not localhost) in `application.properties`

```
eureka.client.service-url.defaultZone=http://eureka-server:8761/eureka/
eureka.instance.hostname=organization-service
```

If running manually, use localhost in `application.properties`

```
eureka.client.service-url.defaultZone=http://localhost:8761/eureka/
eureka.instance.hostname=localhost
```

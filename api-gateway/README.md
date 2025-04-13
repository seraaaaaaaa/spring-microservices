# Spring Cloud API Gateway

| Service              | URL                                                   | Postman                                                                                                                                                                      |
| -------------------- | ----------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| Organization Service | http://localhost:8080/organizations/organization/** | [Test Link](https://www.postman.com/lunar-module-administrator-47202087/spring-microservices/folder/di6tce2/api-gateway?action=share&creator=16400698&ctx=documentation)       |
| Event Service        | http://localhost:8080/events/event/**               | [Test Link](https://www.postman.com/lunar-module-administrator-47202087/spring-microservices/folder/43hrjzz/api-gateway?action=share&creator=16400698&ctx=documentation)       |
| News Service         | http://localhost:8080/news/graphql                    | [Test Link](https://www.postman.com/lunar-module-administrator-47202087/spring-microservices/collection/67f7bc3b36f6188fc3186a73/spring-graphql?action=share&creator=16400698) |

## Configuration Notes

### 🖱️ If running manually :

- use docker to run **Redis**

```
docker run -p 6379:6379 — name redis -d redis
```

- use localhost in `application.yml`

```
  data:
    redis:
      host: localhost
      port: 6379
```

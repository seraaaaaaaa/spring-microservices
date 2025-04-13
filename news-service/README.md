# Spring Boot GraphQL

A Spring Boot application that demonstrates the use of GraphQL.

[![GraphQL](https://skillicons.dev/icons?i=spring,graphql)](https://skillicons.dev)

## Configuration Notes

### 🖱️ If running manually :

- use localhost in `application.properties`

```
eureka.client.service-url.defaultZone=http://localhost:8761/eureka/
eureka.instance.hostname=localhost

spring.rabbitmq.host=localhost

```

- use the GraphQL Playground to run queries, explore the schema, and test the GraphQL API.

http://localhost:8083/graphiql

### 🐳 If using Docker Compose :

- use service names in `application.properties`

```
eureka.client.service-url.defaultZone=http://eureka-server:8761/eureka/
eureka.instance.hostname=news-service

spring.rabbitmq.host=rabbitmq

```

## GraphQL Queries

<table>
<tr>
<td> Action </td> <td> GraphQL </td>
</tr>
<tr>
<td> Create </td>
<td>

```
mutation {
  createNews(
    title: "First News",
    content: "Lorem ipsum..",
  ) {
    id
    title
    content
  }
}
```

</td>
</tr>
<tr>
<td> Find by Id </td>
<td>

```
{
    findNewsById(id:"1"){
        title
        content
    }
}
```

</td>
</tr>
<tr>
<td> Find All </td>
<td>

```
{
    findAllNews{
        title
        content
    }
}
```

</td>
</tr>
<tr>
<td> Delete </td>
<td>

```
mutation {
    deleteNews(id: 1)
}
```

</td>
</tr>

</table>

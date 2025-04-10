FROM openjdk:17-jdk-slim
COPY target/event-service-0.0.1-SNAPSHOT.jar event-service.jar
ENTRYPOINT ["java", "-jar", "event-service.jar"]
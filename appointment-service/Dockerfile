# Dockerfile for Appointment Service
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY target/appointment-service-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "app.jar"]

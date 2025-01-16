FROM maven:3.8.4-openjdk-17 as builder

WORKDIR /build
COPY src/corpo-event/pom.xml .
COPY src/corpo-event/src ./src

RUN mvn clean package -DskipTests

FROM openjdk:17-jdk-slim

WORKDIR /app
COPY --from=builder /build/target/*.jar app.jar

EXPOSE 8080

CMD ["java", "-jar", "app.jar"] 
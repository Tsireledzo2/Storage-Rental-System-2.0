# Stage 1: Build
FROM ubuntu:latest AS build

RUN apt-get update
RUN apt-get install openjdk-17-jdk maven -y

# Copy the project files into the container
COPY . .

# Build the application using Maven
RUN mvn clean package

# Stage 2: Run the application
FROM openjdk:17-jdk-slim

EXPOSE 8080

# Copy the built JAR from the target directory of the build stage
COPY --from=build /target/*.jar app.jar

# Start the application
ENTRYPOINT ["java", "-jar", "app.jar"]

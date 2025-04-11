# Use OpenJDK base image
FROM openjdk:23-jdk-slim

# Set working directory
WORKDIR /app

# Copy JAR file to container
COPY target/auth-service-0.0.1-SNAPSHOT.jar /app/auth-service.jar

# Expose port 8081
EXPOSE 8081

# Command to run the application
ENTRYPOINT ["java", "-jar", "/app/auth-service.jar"] 
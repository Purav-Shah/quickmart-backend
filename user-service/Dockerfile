# Use OpenJDK base image
FROM openjdk:23-jdk-slim

# Set working directory
WORKDIR /app

# Copy JAR file to container
COPY target/user-service-0.0.1-SNAPSHOT.jar /app/user-service.jar

# Expose port 8082
EXPOSE 8086

# Command to run the application
ENTRYPOINT ["java", "-jar", "/app/user-service.jar"] 
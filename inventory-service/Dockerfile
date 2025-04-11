# Use OpenJDK base image
FROM openjdk:23-jdk-slim

# Set working directory
WORKDIR /app

# Copy JAR file to container
COPY target/inventory-service-0.0.1-SNAPSHOT.jar /app/inventory-service.jar

# Expose port 8084
EXPOSE 8083

# Command to run the application
ENTRYPOINT ["java", "-jar", "/app/inventory-service.jar"] 
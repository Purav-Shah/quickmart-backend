# Use OpenJDK base image
FROM openjdk:23-jdk-slim

# Set working directory
WORKDIR /app

# Copy JAR file to container
COPY target/Inventory-Service-0.0.1-SNAPSHOT.jar /app/inventory-service.jar

# Expose port 8084
EXPOSE 8084

# Command to run the application
ENTRYPOINT ["java", "-jar", "/app/inventory-service.jar"] 
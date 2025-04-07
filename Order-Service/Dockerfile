# Use OpenJDK base image
FROM openjdk:23-jdk-slim

# Set working directory
WORKDIR /app

# Copy JAR file to container
COPY target/Order-Service-0.0.1-SNAPSHOT.jar /app/order-service.jar

# Expose port 8086
EXPOSE 8084

# Command to run the application
ENTRYPOINT ["java", "-jar", "/app/order-service.jar"] 
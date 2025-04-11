# Use OpenJDK base image
FROM openjdk:23-jdk-slim

# Set working directory
WORKDIR /app

# Copy JAR file to container
COPY target/payment-service-0.0.1-SNAPSHOT.jar /app/payment-service.jar

# Expose port 8085
EXPOSE 8085

# Command to run the application
ENTRYPOINT ["java", "-jar", "/app/payment-service.jar"] 
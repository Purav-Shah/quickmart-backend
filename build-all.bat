@echo off
echo Building all services...

cd Eureka-Server
call mvn clean package -DskipTests
cd ..

cd API-Gateway
call mvn clean package -DskipTests
cd ..

cd Auth-Service
call mvn clean package -DskipTests
cd ..

cd User-Service
call mvn clean package -DskipTests
cd ..

cd Product-Service
call mvn clean package -DskipTests
cd ..

cd Inventory-Service
call mvn clean package -DskipTests
cd ..

cd Payment-Service
call mvn clean package -DskipTests
cd ..

cd Order-Service
call mvn clean package -DskipTests
cd ..

echo All services built successfully! 
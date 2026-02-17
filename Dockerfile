# Step 1: Use a reliable JDK image
FROM eclipse-temurin:17-jdk-alpine

# Step 2: Set the working directory
WORKDIR /app

# Step 3: Copy the jar file (Maven builds into the target folder)
COPY target/*.jar app.jar

# Step 4: Expose the port
EXPOSE 8080

# Step 5: Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
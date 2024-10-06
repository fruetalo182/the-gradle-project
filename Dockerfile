# Use a specific version of OpenJDK for better reproducibility
FROM eclipse-temurin:17-jre-jammy as builder

# Set the working directory in the container
WORKDIR /app

# Copy the jar file into the container
COPY build/libs/the-gradle-project-1.0-SNAPSHOT.jar app.jar

# Extract the jar to improve layer caching
RUN java -Djarmode=layertools -jar app.jar extract

# Use a minimal base image for the final image
FROM eclipse-temurin:17-jre-jammy

# Create a non-root user to run the application
RUN useradd -r -u 1001 -g root appuser

# Set the working directory
WORKDIR /app

# Copy the extracted layers from the builder stage
COPY --from=builder app/dependencies/ ./
COPY --from=builder app/spring-boot-loader/ ./
COPY --from=builder app/snapshot-dependencies/ ./
COPY --from=builder app/application/ ./

# Set ownership to the non-root user
RUN chown -R appuser:root /app

# Use the non-root user to run the application
USER 1001

# Expose the port the app runs on
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java", "org.springframework.boot.loader.JarLauncher"]
package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Main application class for the Spring Boot web application.
 */
@SpringBootApplication
@RestController
public final class App {

    /**
     * Main method to start the Spring Boot application.
     *
     * @param args command line arguments
     */
    public static void main(final String[] args) {
        SpringApplication.run(App.class, args);
    }

    /**
     * Endpoint that returns a greeting message.
     *
     * @return a greeting string
     */
    @GetMapping("/")
    public String hello() {
        return "Hello, Gradle)";
    }
}

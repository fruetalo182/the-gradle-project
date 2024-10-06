package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Main application class for the Spring Boot application.
 *
 * This class serves as the entry point for the application.
 */
@SpringBootApplication
@RestController
public class App {

    /**
     * Main method to run the Spring Boot application.
     *
     * @param args command-line arguments.
     */
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }


    /**
     * REST endpoint that returns a greeting message.
     *
     * @return a greeting string.
     */
    @GetMapping("/")
    public String hello() {
        return "Hello, Gradle!";
    }
}

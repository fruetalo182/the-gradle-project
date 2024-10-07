package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import java.io.IOException;


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
    public static void main(final String[] args) {
        SpringApplication.run(App.class, args);
    }

    /**
     * REST endpoint that returns Travis image.
     *
     * @return a greeting string.
     */
    @GetMapping(value = "/", produces = MediaType.IMAGE_JPEG_VALUE)
    public ResponseEntity<Resource> getImage() throws IOException {
        Resource resource = new ClassPathResource("travis_real.png");
        return ResponseEntity.ok().body(resource);
    }
}

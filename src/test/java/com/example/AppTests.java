package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class AppTests {

    /**
     * MockMvc instance used to perform HTTP requests in tests.
     */
    @Autowired
    private MockMvc mockMvc;

    /**
     * Ensure it returns a 200 status and the correct content.
     *
     * @throws Exception if the request fails
     */
    @Test
    public void testHelloEndpoint() throws Exception {
        mockMvc.perform(get("/"))
               .andExpect(status().isOk())
               .andExpect(content().string("Hello, Gradle!"));
    }
}

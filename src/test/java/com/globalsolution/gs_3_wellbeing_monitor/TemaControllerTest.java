// src/test/java/com/globalsolution/gs_3_wellbeing_monitor/TemaControllerTest.java
package com.globalsolution.gs_3_wellbeing_monitor;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;

// Foca o teste apenas na TemaController
@WebMvcTest(TemaController.class)
public class TemaControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldReturnInfoJson() throws Exception {
        // Testa o endpoint GET /info [cite: 33]
        mockMvc.perform(get("/info"))
               .andExpect(status().isOk()) // Espera status HTTP 200 (OK)
               .andExpect(jsonPath("$.tema").exists()) // Verifica se o campo 'tema' está presente
               .andExpect(jsonPath("$.membro1").exists()); // Verifica se o campo 'membro1' está presente
    }
}
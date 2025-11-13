// src/main/java/com/globalsolution/gs_3_wellbeing_monitor/TemaController.java
package com.globalsolution.gs_3_wellbeing_monitor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
import java.util.HashMap;

@RestController
public class TemaController {

    @GetMapping("/info") // Endpoint obrigatório GET /info [cite: 33]
    public Map<String, String> getInfo() {
        Map<String, String> response = new HashMap<>();
        
        // Retorno JSON obrigatório [cite: 34]
        response.put("tema", "Ferramentas de monitoramento de bem-estar e saúde mental");
        response.put("membro1", "Seu Nome Completo (RM: 99996)");
        response.put("membro2", "Nome do Seu Colega (RM: 92957)");
        response.put("descricao", "Microserviço de integração para o monitoramento de bem-estar em ambientes corporativos."); // Descrição do tema [cite: 40]
        
        return response;
    }
}
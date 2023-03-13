package com.example.demo.src.chatGptApi.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import okhttp3.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;

@Component
public class GPTClient {
    private static final String API_URL = "https://api.openai.com/v1/engines/davinci-codex/completions";

    private final String apiUrl = "https://api.openai.com/v1";

    private final OkHttpClient httpClient = new OkHttpClient();
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Value("${openai.api.key}")
    private String apiKey;

    public String getCompletion(String prompt) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(org.springframework.http.MediaType.APPLICATION_JSON);
        headers.setBearerAuth(apiKey);

        String requestBody = "{\"prompt\": \"" + prompt + "\", \"max_tokens\": 256, \"model\": \"text-davinci-003\"}";

        HttpEntity<String> entity = new HttpEntity<>(requestBody, headers);
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<String> response = restTemplate.postForEntity(apiUrl + "/completions", entity, String.class);

        try {
            return parseResponse(response.getBody());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static String parseResponse(String responseBody) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode rootNode = objectMapper.readTree(responseBody);

        JsonNode choicesNode = rootNode.get("choices");
        if (choicesNode != null && choicesNode.isArray()) {
            JsonNode firstChoiceNode = choicesNode.get(0);
            if (firstChoiceNode != null) {
                JsonNode textNode = firstChoiceNode.get("text");
                if (textNode != null && textNode.isTextual()) {
                    return textNode.asText();
                }
            }
        }

        throw new IllegalArgumentException("Invalid response body: " + responseBody);
    }

}


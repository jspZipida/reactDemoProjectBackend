package com.example.demo.src.chatGptApi.DTO;


import lombok.Data;

@Data
public class GPTRequest {
    private String prompt;
    private int maxTokens;
    private double temperature;
    // getters and setters omitted for brevity
}
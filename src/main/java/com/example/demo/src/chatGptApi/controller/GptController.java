package com.example.demo.src.chatGptApi.controller;

import com.example.demo.src.chatGptApi.service.GPTClient;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/gpt")
public class GptController {

    @Autowired
    private GPTClient gptClient;

    @GetMapping("/getGpt")
    public String getGpt(Model model){
        return "success";
    }

    @PostMapping("/message")
    public String sendMessage2(@RequestBody Map<String, String> body) throws JsonProcessingException {
        String message = body.get("message");


        String test = gptClient.getCompletion(message);

        return test;
    }
}

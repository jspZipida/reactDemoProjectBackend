package com.example.demo.src.chatGptApi.DTO;

import java.util.List;

public class ChatGPTResponse {

    private List<Choice> choices;

    public List<Choice> getChoices() {
        return choices;
    }

    public void setChoices(List<Choice> choices) {
        this.choices = choices;
    }

    public static class Choice {
        private String text;
        private double score;

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public double getScore() {
            return score;
        }

        public void setScore(double score) {
            this.score = score;
        }
    }
}

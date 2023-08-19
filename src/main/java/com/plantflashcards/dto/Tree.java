package com.plantflashcards.dto;

public class Tree extends Plant {

    private String fullColor;

    public String getFullColor() {
        return fullColor;
    }

    public void setFullColor(String fullColor) {
        this.fullColor = fullColor;
    }

    @Override
    public String getScientificName() {
        return "This tree is: " + super.getScientificName();
    }
}

package com.plantflashcards.dto;

public class Plant implements IPlant {

    private String genus;
    private String species;
    private String cultivar;
    private String commonName;
    private int height;

    public int getHeight() {
        return height;
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
    }

    public String getGenus() {
        return genus;
    }

    @Override
    public void setGenus(String genus) {
        this.genus = genus;
    }

    public String getSpecies() {
        return species;
    }

    @Override
    public void setSpecies(String species) {
        this.species = species;
    }

    public String getCultivar() {
        return cultivar;
    }

    @Override
    public void setCultivar(String cultivar) {
        this.cultivar = cultivar;
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName;
    }

    @Override
    public String getScientificName() {
        return getGenus() + " " + getSpecies() + " " + getCultivar();
    }
}

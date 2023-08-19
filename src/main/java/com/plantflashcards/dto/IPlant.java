package com.plantflashcards.dto;


/**
 * Describe a plant
 */
public interface IPlant {

    public void setHeight(int height);
    public void setGenus(String genus);
    public void setSpecies(String species);
    public void setCultivar(String cultivar);

    /**
     * Return the latin name of the plant.
     * @return
     */
    public String getScientificName();
}

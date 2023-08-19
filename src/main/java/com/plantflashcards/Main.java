package com.plantflashcards;

import com.plantflashcards.dto.IPlant;
import com.plantflashcards.dto.Plant;
import com.plantflashcards.dto.Tree;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        list();
    }

    private static void list() {
        IPlant plant = new Plant();
        plant.setGenus("Cercis");
        plant.setSpecies("canadensis");
        plant.setCultivar("alba");

        Tree pawpaw = new Tree();
        pawpaw.setGenus("Asimina");
        pawpaw.setSpecies("Triloba");
        pawpaw.setCultivar("Potomac");
        pawpaw.setHeight(6);

        List<IPlant> allPlants = new ArrayList<>();
        allPlants.add(plant);
        allPlants.add(pawpaw);

        for (IPlant iPlant: allPlants) {
            System.out.println("Plant: " + iPlant.getScientificName());
        }

    }
}

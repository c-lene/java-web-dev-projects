package org.launchcode;

public class Pet {
    private String name;


    // CONSTRUCTOR
    Pet(String name) {
        this.name = name;
    }


    // GETTERS
    public String getName() {
        return name;
    }


    public boolean equals(Object petToCheck) {

        // Reference Check
        if (petToCheck == this) {
            return true;
        }


        // Null check
        if (petToCheck == null) {
            return false;
        }


        // Class check
        if (petToCheck.getClass() != getClass()) {
            return false;
        }


        // Cast
        Pet thePet = (Pet) petToCheck;
        return thePet.getName() == getName();
    }

}



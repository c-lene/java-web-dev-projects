package org.launchcode;

import java.util.ArrayList;

public class ArrayListPlanets {
    public static void main(String [] args) {

        // Declare & Initialize a new ArrayList called 'planets'
        ArrayList<String> planets = new ArrayList<>();

        // Using add() method to populate a collection of items to 'planets' ArrayList
        planets.add("Mercury");
        planets.add("Venus");
        planets.add("Earth");
        planets.add("Mars");
        planets.add("Jupiter");
        planets.add("Saturn");
        planets.add("Uranus");
        planets.add("Neptune");

        // Declares a new String Array called 'planetsArray' with a size of 'planets' ArrayList
        String[] planetsArray = new String[planets.size()];

        // Returns 'planetsArray' Array containing the elements of the 'planets' Array
        planets.toArray(planetsArray);

        System.out.print(planetsArray);


        // Check Your Understanding - Question #6
        System.out.println("");
        System.out.println("Check Your Understanding - Question #6");

        ArrayList<String> charStars = new ArrayList<>();
        charStars.add("a");
        charStars.add("b");
        charStars.add("c");

        System.out.println(charStars);

    }
}

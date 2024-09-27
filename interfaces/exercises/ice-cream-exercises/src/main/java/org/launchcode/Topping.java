package org.launchcode;

import java.util.ArrayList;

// BONUS MISSION #2: Create Topping class that extends Ingredient class
public class Topping extends Ingredient{

    public Topping(String aName, double aCost, ArrayList<String> someAllergens) {
        super(aName, aCost, someAllergens);
    }
}

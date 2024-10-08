package org.launchcode;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        ArrayList<Topping> toppings = menu.getToppings();




        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.

        // STEP 1: Creates new 'FlavorComparator' object
        Comparator comparator = new FlavorComparator();

        // STEP 2: Calls the Sort method on 'flavors' and pass the 'comparator' object as the argument
        flavors.sort(comparator);

        // TIP: Instead of Declaring & Initializing comparator object (STEPS 1-2) - Both steps can be combined to a SINGLE statement
//        flavors.sort(new FlavorComparator());


        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.

        // STEP 1: Creates new 'ConeComparator' object
        Comparator comparator1 = new ConeComparator();

        // STEP 2: Calls the Sort method on 'cones' and pass the 'comparator1' object as the argument
        cones.sort(comparator1);


        // TIP: Instead of Declaring & Initializing comparator object (STEPS 1-2) - Both steps can be combined to a SINGLE statement
//        flavors.sort(new ConeComparator());


        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.

        /**** SORTED Flavors List by Name ****/
        System.out.println("\n\nSORTED Flavors list by Name: ");
        System.out.println("");

        // Iterates through SORTED flavor list to print results
        for (Flavor flavor : flavors) {

            // Prints out the list of flavor names sorted alphabetically by name
            System.out.println(flavor.getName());
        }


        /**** SORTED Cones List by Cost ****/
        System.out.println("\n\nSORTED Coness list by Cost: ");
        System.out.println("");

        // Iterates through SORTED flavor list to print results
        for (Cone cone : cones) {

            // Prints out the list of cone names & cost sorted by cost
            System.out.println(cone.getName() + ": " + "$" + cone.getCost());
        }


        // BONUS MISSION #1
        /**** SORTED Flavors List by Number of Allergens (Highest to Lowest) ****/

        Comparator comparator2 = new FavorAllergensComparator();
        flavors.sort(comparator2);

        System.out.println("\n\nSORTED Flavors list by Number of Allergens (HIGHEST to LOWEST): ");
        System.out.println("");

        for (Flavor flavor : flavors) {
            System.out.println(flavor);
        }


        // BONUS MISSION #2
        /**** SORTED Toppings List by Number of Allergens (Lowest to Highest) ****/
        Comparator comparator3 = new ToppingComparator();
        toppings.sort(comparator3);

        System.out.println("\n\nSORTED Flavors list by Number of Allergens (LOWEST to HIGHEST): ");
        System.out.println("");

        for (Topping topping : toppings) {
            System.out.println(topping);
        }

    }
}
package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {


    /**** FIELDS ****/

    private LocalDate lastUpdated;
    private ArrayList<MenuItem> items = new ArrayList<>();




    /**** CONSTRUCTORS ****/

//    public Menu(LocalDate d, ArrayList<MenuItem> i) {
//        this.lastUpdated = d;
//        this.items = i;
//    }




    /**** GETTERS & SETTERS ****/

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }




    /**** SPECIAL METHODS ****/

    // TODO: Define custom toString() method
    // List many items, grouped by category

    @Override
    public String toString() {

        // StringBuilder for "appetizer"
        StringBuilder appetizers = new StringBuilder();
        for (MenuItem item : items) {
            if (item.getItemCategory().equals("appetizer")) {
                appetizers.append("\n").append(item.toString()).append("\n");
            }
        }


        // StringBuilder for "main course"
        StringBuilder mainCourses = new StringBuilder();
        for (MenuItem item : items) {
            if (item.getItemCategory().equals("main course")) {
                mainCourses.append("\n").append(item.toString()).append("\n");
            }
        }


        // StringBuilder for "dessert"
        StringBuilder desserts = new StringBuilder();
        for (MenuItem item : items) {
            if (item.getItemCategory().equals("dessert")) {
                desserts.append("\n").append(item.toString()).append("\n");
            }
        }

        return "\n~~~~~~~~~~~~~~~ C-Lene's Vietnamese Cuisine Menu ~~~~~~~~~~~~~~~\n" +
                "APPETIZERS: " + "\n\t" + appetizers.toString() + "\n" +
                "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                "MAIN COURSES: " + "\n\t" + mainCourses.toString() + "\n" +
                "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n" +
                "DESSERTS: " + "\n\t" + desserts.toString() + "\n";

    }





    /**** INSTANCE METHODS ****/

    // TODO: Define addItem()
    // Make sure to update LastUpdated anytime something is successfully added
    // BONUS MISSION: Prevent addition of duplicates

    void addItem(MenuItem newItem) {

        String duplicateMessage = "\nDuplicate Item. Item cannot be added to the menu!\n";

        if (items.contains(newItem)) {
            System.out.println(duplicateMessage);
            return;
        }

        for (MenuItem item : items) {
            if (item.equals(newItem)) {
                System.out.println(duplicateMessage);
                return;
            }
        }

        items.add(newItem);
        lastUpdated = LocalDate.now();


        // My method of checking duplicates
//        if (items.contains(newItem)) {
//            System.out.println("\nDuplicate Item. Cannot be added!\n");
//
//        } else {
//            items.add(newItem);
//            lastUpdated = LocalDate.now();
//        }
    }



    // TODO: Define removeItem()
    // Make sure to update lastUpdated anytime something is removed

    void removeItem(MenuItem item) {
        items.remove(item);
        lastUpdated = LocalDate.now();
    }


}



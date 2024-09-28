package org.launchcode;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class MenuItem {

    // FIELDS
    private String itemName;
    private double itemPrice;
    private String itemDescription;
    private String itemCategory;
    private boolean isNew;
    private final LocalDate dateAdded;


    // CONSTRUCTORS
    public MenuItem(String name, double price, String description, String category) {
        this.itemName = name;
        this.itemPrice = price;
        this.itemDescription = description;
        this.itemCategory = category;
//        this.isNew = iN;
        this.dateAdded = LocalDate.now();

        // Tests isNew() to be false
//        this.dateAdded = LocalDate.parse("2022-06-12");

    }



    // GETTERS & SETTERS
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }



    // SPECIAL METHODS

    // TODO: Define custom toString() method
    // format name, description, price & conditional "NEW!"

    @Override
    public String toString() {

        // Using Ternary Operator to assign text
        // If statement is TRUE ==> print out "NEW!"
        // Else ==> print out empty space
        String newItemText = isNew() ? "  (NEW!) " : " ";

        return  "\n" + this.itemName + "                 " + this.itemPrice + newItemText +
                "\n\t" + this.itemCategory +
                "\n\t" + this.itemDescription;

    }


    // TODO: Define custom equals() method
    // Overrides to not compare the location in Memory but to compare actual contents
    // 'toBeCompared' represents the object that is being compared

    @Override
    public boolean equals(Object toBeCompared) {

        // Reference check
        // Uses "this" keyword to refer to the class object within the class
        if (this == toBeCompared) {

            // Returns TRUE if they are the SAME in memory location
            return true;
        }

        // Null check
        if (toBeCompared == null) {

            // Returns FALSE if the object to be compared returns null
            // Indicates they are clearly NOT the same objects
            return false;
        }

        // Class check
        if (getClass() != toBeCompared.getClass()) {

            // Returns FALSE if the two objects are NOT from the same class
            return false;
        }


        // When we are sure they objects are from the SAME class then we will cast it

        // Casting - We are setting compared object while casting it to MenuItem
        // Allowing us to use 'otherMenuItem' to access the properties
        MenuItem otherMenuItem = (MenuItem) toBeCompared;

        // After all the checks is TRUE - Returns the result of comparing the item names
        return this.itemName.equals(otherMenuItem.getItemName());

    }


    // INSTANCE METHODS

    // TODO: Define instance method isNew()

    // Returns TRUE if item added within last 90 days
    boolean isNew() {
        LocalDate today = LocalDate.now();
        double daysBetween = getDateAdded().until(today, ChronoUnit.DAYS);

        // Returns TRUE/FALSE if vaalue of 'daysBetween' is LESS THAN 90
        return daysBetween < 90;
    }

}


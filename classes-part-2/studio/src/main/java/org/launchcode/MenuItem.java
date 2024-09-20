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
    public MenuItem(String name, double price, String description, String category, boolean iN) {
        this.itemName = name;
        this.itemPrice = price;
        this.itemDescription = description;
        this.itemCategory = category;
        this.isNew = iN;
        this.dateAdded = LocalDate.now();
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



    // TODO: Define custom equals() method






    // INSTANCE METHODS

    // TODO: Define instance method isNew()
    // return true if item added within last 90 days
    boolean isNew() {
        LocalDate today = LocalDate.now();
        double daysBetween = getDateAdded().until(today, ChronoUnit.DAYS);
        return daysBetween < 90;
    }





}


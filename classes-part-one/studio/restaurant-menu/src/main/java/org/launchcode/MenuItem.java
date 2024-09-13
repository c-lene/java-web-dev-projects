package org.launchcode;

import java.time.LocalDate;

public class MenuItem {

    // Declaring Fields
    private String itemName;
    private float itemPrice;
    private String itemDescription;
    private String itemCategory;
    private final LocalDate dateAdded;


    // Creating a Constructor
    public MenuItem(String itemName, float itemPrice, String itemDescription, String itemCategory) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemDescription = itemDescription;
        this.itemCategory = itemCategory;
        this.dateAdded = LocalDate.now();
    }


    // Getter for 'getItemName'
    public String getItemName() {
        return itemName;
    }

    // Setter for 'getItemName'
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }


    // Getter for 'getItemPrice'
    public float getItemPrice() {
        return itemPrice;
    }

    // Setter for 'getItemPrice'
    public void setItemPrice(float itemPrice) {
        this.itemPrice = itemPrice;
    }


    // Getter for 'getItemDescription'
    public String getItemDescription() {
        return itemDescription;
    }

    // Setter for 'getItemDescription'
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }


    // Getter for 'getItemCategory'
    public String getItemCategory() {
        return itemCategory;
    }

    // Setter for 'getItemCategory'
    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }


    // // Getter for 'getDateAdded'
    public LocalDate getDateAdded() {
        return dateAdded;
    }
}

package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Menu {

    // Declaring Fields
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private LocalDate dateLastUpdated;


    // Using DEFAULT Constructor


    // Setter for 'menuItems'
    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }
}

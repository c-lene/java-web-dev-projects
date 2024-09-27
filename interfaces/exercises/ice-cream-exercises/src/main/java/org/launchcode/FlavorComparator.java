package org.launchcode;

import java.util.Comparator;

// Exercise #1
public class FlavorComparator implements Comparator<Flavor> {

    // Generated by selecting "Implement methods" >> chooose "compare(o1:T, o2:T):int"
    @Override
    public int compare(Flavor flavor1, Flavor flavor2) {

        // Return "0" indicates No Sorting - Default setting
//        return 0;


        // Returns an integer (negative, positive, or zero) depending on whether 'Flavor' object o1 or o2 comes first, alphabetically
        return flavor1.getName().compareTo(flavor2.getName());
    }
}

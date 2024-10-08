package org.launchcode;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone> {

    // Generated by selecting "Implement methods" >> chooose "compare(o1:T, o2:T):int"
    // Object parameters are derived from Objects in 'Case' class
    @Override
    public int compare(Cone cone1, Cone cone2) {

        if (cone1.getCost() - cone2.getCost() < 0) {
            // Returns NEGATIVE if cone1 < cone2
            return -1;

        } else if (cone1.getCost() - cone2.getCost() > 0) {
            // Returns POSITIVE if cone1 > cone2
            return 1;

        } else {
            // Return "0" indicates No Sorting - cone1 == cone2
            return 0;
        }
    }
}

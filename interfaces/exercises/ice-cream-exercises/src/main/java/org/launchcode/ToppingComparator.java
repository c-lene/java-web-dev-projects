package org.launchcode;

import java.util.Comparator;

// BONUS MISSION 2: Sort Flavor objects by the NUMBER of Allergens from LOWEST to HIGHEST
public class ToppingComparator implements Comparator<Topping> {
    @Override
    public int compare(Topping topping1, Topping topping2) {
        if (topping1.getAllergens().size() - topping2.getAllergens().size() < 0) {
            // Returns NEGATIVE if '# of Allergens in flavor1' < '# of Allergens in flavor2'
            return -1;

        } else if (topping1.getAllergens().size() - topping2.getAllergens().size() > 0) {
            // Returns POSITIVE if '# of Allergens in flavor1' > '# of Allergens in flavor2'
            return 1;

        } else {
            // Return "0" indicates No Sorting if '# of Allergens in flavor1' == '# of Allergens in flavor2'
            return 0;
        }
    }
}

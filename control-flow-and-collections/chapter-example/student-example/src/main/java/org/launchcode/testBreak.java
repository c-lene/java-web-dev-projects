package org.launchcode;

public class testBreak {
    public static void main(String[] args) {
        int[] someInts = {1, 10, 2, 3, 5, 8, 10};
        int searchTerm = 10;

        // Using For Loop to search each element in Array for 'someInt'
        for (int oneInt : someInts) {
            System.out.println(oneInt);

            // Using IF statement - IF 'oneInt' is EQUAL TO 'searchTerm' THEN print out "Found it!" & TERMINATE Loop
            if (oneInt == searchTerm) {
                System.out.println("Found it!");
                break;
            }
        }
    }
}

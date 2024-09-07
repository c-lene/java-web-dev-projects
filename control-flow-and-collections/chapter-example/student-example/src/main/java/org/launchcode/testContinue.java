package org.launchcode;

public class testContinue {
    public static void main(String [] args) {
        int[] someInts = {1, 10, 2, 3, 5, 8, 10};
        int searchTerm = 10;

        // Using For Loop to iterate through each element in Array of 'someInts'
        for (int oneInt : someInts) {

            // Using IF statement to search for 'searchTerm' & CONTINUE through the Loop
            if (oneInt == searchTerm) {
                System.out.println(oneInt + " - Found It!");
                continue;
            }

            // Prints out EACH unmatched element in the loop as it iterates through the Array
            System.out.println(oneInt + " - Not here!");
        }
    }
}

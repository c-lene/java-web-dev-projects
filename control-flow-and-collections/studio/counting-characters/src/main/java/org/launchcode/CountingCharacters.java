package org.launchcode;

import java.util.HashMap;
import java.util.Map;

public class CountingCharacters {
    public static void main(String[] args) {

        // Declaring & Initializing varibales
        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        Integer letterCount = 0;
        Integer letterValue = 0;

        char[] charactersInString = quote.toCharArray();

        // Declaring HashMap 'letterCount' with a String = Key, Integer = Value
        HashMap<Character, Integer> numLetter = new HashMap<>();

        // For each char 'letter' in 'charactersInString' array
        for (char letter : charactersInString) {

            // Using If-Else Statement - IF numLetter HashMap contains a Key = 'letter'
            if (numLetter.containsKey(letter)) {

                // ADD 1 to the current value
                letterValue = numLetter.get(letter) + 1;

                // Using put() method to specify both Key & Value
                numLetter.put(letter, letterValue);

            } else {

                // IF numLetter HashMap does NOT contain a Key = 'letter' - THEN set value to 1
                letterValue = 1;
                numLetter.put(letter, letterValue);
            }
        }

        // Using Map.Entry in a For-Each Loop to print out Key/Value pairs within the HashMap
        for (Map.Entry<Character, Integer> numLetterCount : numLetter.entrySet()) {
            System.out.println(numLetterCount.getKey() + " : " + numLetterCount.getValue());
        }
    }
}

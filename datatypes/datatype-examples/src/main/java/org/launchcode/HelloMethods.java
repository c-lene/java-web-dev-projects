package org.launchcode;

public class HelloMethods {

    public static void main(String[] args) {
        String message = Message.getMessage("fr");
        System.out.println("Greeting in French: " + message);

        String message1 = Message.getMessage("sp");
        System.out.println("Greeting in Spanish: " + message1);
    }
    
}
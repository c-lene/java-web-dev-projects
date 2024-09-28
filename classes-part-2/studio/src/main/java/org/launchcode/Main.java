package org.launchcode;

public class Main {

    public static void main(String[] args) {
        // write your code here

        // TODO: Create 5 menu items in different categories

        MenuItem menuItem1 = new MenuItem("Pho Dac Biet", 19.95, "Rice noodles with Combination of Rare Beef meat in Beef Pho Broth", "main course");
        MenuItem menuItem2 = new MenuItem("Egg Rolls", 2.95, "1 pc. - Pork & Vegetables wrapped in Rice paper and deep fried to perfection", "appetizer");
        MenuItem menuItem3 = new MenuItem("Che Bap", 5.95, "Sweet Corn in Sticky rice topped with Coconut Milk", "dessert");
        MenuItem menuItem4 = new MenuItem("Goi Cuon (Spring Rolls)", 6.95, "2 pc - Freshly Cooked Shrimp & Pork, Vermicelli, Cilantro, Beansprouts, and Lettuce wrapped in Rice paper and served w/ peanut sauce", "appetizer");
        MenuItem menuItem5 = new MenuItem("Bun Thit Nuong Cha Gio", 14.95,"Vermicelli noodles topped with Grilled Pork, Mixed greens, Egg Roll, and Crushed Peanuts served w/ House Special fish sauce", "main course");

        // Test to Print out results using isNew()
        System.out.println(menuItem1.isNew());



        // TODO: Print first item
        System.out.println(menuItem1);



        // TODO: Create menu
        Menu menu = new Menu();

        // TODO: Add items to menu and print it
        menu.addItem(menuItem1);
        menu.addItem(menuItem2);
        menu.addItem(menuItem3);
        menu.addItem(menuItem4);
        menu.addItem(menuItem5);

        // Prints out 'menu' to see added menu items
        System.out.println(menu);


        // TODO: Remove an item and print menu
        menu.removeItem(menuItem4);

        // Prints out 'menu' again to see updates
        System.out.println(menu);



        // TODO: Test equals method

        // Check if the contents of menuItem5 are the same as contents of menuItem1
        System.out.println("\nAre 'menuItem5' the same as 'menuItem1'? ");
        System.out.println(menuItem3.equals(menuItem1));


        // Check if the contents of menuItem5 are the same as contents of menuItem6
        MenuItem menuItem6 = new MenuItem("Bun Thit Nuong Cha Gio", 14.95,"Vermicelli noodles topped with Grilled Pork, Mixed greens, Egg Roll, and Crushed Peanuts served w/ House Special fish sauce", "main course");

        System.out.println("\nAre 'menuItem5' the same as 'menuItem6'? ");
        System.out.println(menuItem5.equals(menuItem6));




        // BONUS MISSION
        // TODO: Attempt to add a duplicate item, then print menu to confirm it wasn't added

        menu.addItem(menuItem6);
        System.out.println(menu);

    }
}

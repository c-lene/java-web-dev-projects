public class Main {

    public static void main(String[] args) {
        HouseCat garfield = new HouseCat("Garfield", 12);

        // Instance method eat() is inherited from Cat class
        garfield.eat();

        // isTired() is an inherited getter from Cat class - Prints out "true"
        System.out.println(garfield.isTired());



        // Confirms Base Class Constructor has been called due to getWeight() prints out "13.0"
        HouseCat spike = new HouseCat("Spike");
        System.out.println(spike.getWeight());



        /**** @Override Example ****/

        // Creating new objects from Cat & HouseCat
        Cat plainCat = new Cat(8.6);
        HouseCat cheshireCat = new HouseCat("Cheshire", 12);

        // Prints out "Meeeeeeooooowww!"
        System.out.println(plainCat.noise());

        // Prints out "Hello, my name is Cheshire!"
        System.out.println(cheshireCat.noise());



        /**** Casting Example ****/

        // Polymorphism Example - Creating a HouseCat object stored in Cat variable/field
        Cat suki = new HouseCat("Suki", 8);

        // Calls HouseCat's noise() method - Prints out "Hello, my name is Suki!"
        System.out.println(suki.noise());

        // Results in Compiler Error - since Cat does NOT have isSatisfied Method
        // HouseCat object stored in Cat variable/field CANNOT call methods from HouseCat
//        suki.isSatisfied();

        // As long as 'suki' really is a HouseCat, this works
        ((HouseCat) suki).isSatisfied();

    }

}

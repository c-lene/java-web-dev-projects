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
    }

}

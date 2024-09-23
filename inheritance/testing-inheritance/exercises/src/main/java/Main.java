public class Main {

    public static void main(String[] args) {
        HouseCat garfield = new HouseCat("Garfield", 12);

        // Instance method eat() is inherited from Cat class
        garfield.eat();


        // isTired() is an inherited getter from Cat class - Prints "true"
        System.out.println(garfield.isTired());
    }

}

/* Copied from Inheritance Chapter Examples */

public class HouseCat extends Cat {
    private String name;
    private String species = "Felis catus";


    /**** Constructors ****/
    public HouseCat(String aName, double aWeight) {

        // Using "super" keyword to access the Constructor from Base class 'Cat'
        /**** Must be the FIRST LINE of the Subclass constructor ****/
        super(aWeight);
        name = aName;
    }

    // Defined another Constructor - the Cat no-argument constructor will be applied
    public HouseCat(String aName) {
        name = aName;
    }



    public boolean isSatisfied() {
        return !isHungry() && !isTired();
    }

    @Override
    public String noise() {
        return "Hello, my name is " + name + "!";
    }

    public String purr() {
        return "I'm a HouseCat";
    }
}
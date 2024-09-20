package org.launchcode;

public class Temperature {

    private double fahrenheit;

    private static double absoluteZeroFahrenheit = -459.67;

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double aFahrenheit) {

        if (aFahrenheit < absoluteZeroFahrenheit) {
            throw new IllegalArgumentException("Value is below absolute zero");
        }

        fahrenheit = aFahrenheit;
    }

    /* rest of the class... */
    public static void main(String[] args) {

        public Temperature temp = new Temperature();


        // Use a static field the same way as a normal, non-static field
        System.out.println(("Absolute zero in F is: " + absoluteZeroFahrenheit));

        // We can also be more explicit - using "this" keyword does NOT work
//        System.out.println("Absolute zero in F is: " + this.absoluteZeroFahrenheit);

        // If the static field is public, we can do this
        System.out.println("Absolute zero in F is: " + Temperature.absoluteZeroFahrenheit);

        // OR if we have an object named "temp" of type Temperature
        System.out.println("Absolute zero in F is: " + temp.absoluteZeroFahrenheit);


    }

}

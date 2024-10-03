package org.launchcode;

public class Temperature {
    private double fahrenheit;

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double aFahrenheit) {

        double absoluteZeroFahrenheit = -459.67;

        if (aFahrenheit < absoluteZeroFahrenheit) {

            // Using Try/Catch block to TRY throwing the Exception, if CATCH error (e) ==> Print the stack trace
            try {
                throw new TemperatureException("That temperature is TOO LOW!");
            } catch (TemperatureException e) {
                e.printStackTrace();
            }
//            System.out.println("Value is below absolute zero");
        }

        fahrenheit = aFahrenheit;
    }
}

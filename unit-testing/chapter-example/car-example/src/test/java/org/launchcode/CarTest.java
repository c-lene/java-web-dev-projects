package org.launchcode;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    @Test
    public void emptyTest() {
        assertEquals(10,10,.001);
        System.out.println("emptyTest executed");
    }


    //TODO: constructor sets gasTankLevel properly

    Car test_car;

    @BeforeEach
    public void createCarObject() {
        test_car = new Car("Toyota", "Prius", 10, 50);
        System.out.println("\n@BeforEach executed  ~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }

    @Test
    public void testInitialGasTank() {
//        Car test_car = new Car("Toyota", "Prius", 10,50);
        assertEquals(10, test_car.getGasTankLevel(), .001);
        System.out.println("'testInitialGasTank' executed");
    }


    @AfterEach
    public void afterEachTest() {
        System.out.println("~~~~~~~~~~~~~ @AfterEach executed ~~~~~~~~~~~~~");
    }


    // Check Your Understanding Questions
    @Test
    public void testInitialGasTankFalse() {
//        assertFalse(test_car.getGasTankLevel() > 11);
        assertFalse(test_car.getGasTankLevel() == 0);
//        assertFalse(test_car.getGasTankLevel() != 0);
//        assertFalse(test_car.getGasTankLevel() == 0, 0.01);
//        assertFalse(test_car.getGasTankLevel());
        System.out.println("'testInitialGasTankFalse' executed");
    }

    @Test
    public void testInitialGasTankTrue() {
//        assertTrue(test_car.getGasTankLevel() > 5);
//        assertTrue(test_car.getGasTankLevel() != 0);
        assertTrue(test_car.getGasTankLevel() == 10);
        System.out.println("'testInitialGasTankTrue' executed");
    }






    //TODO: gasTankLevel is accurate after driving within tank range
    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    //TODO: can't have more gas than tank size, expect an exception
}
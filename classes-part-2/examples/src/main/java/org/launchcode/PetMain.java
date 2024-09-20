package org.launchcode;

public class PetMain {
    public static void main(String[] args) {
        String firstPet = "Fluffy";
        Pet secondPet = new Pet("Fluffy");
        Pet thirdPet = new Pet("Fluffy");

//        System.out.println(firstPet == secondPet);
        System.out.println(secondPet == thirdPet);
        System.out.println(thirdPet.equals(secondPet));
        System.out.println(thirdPet.getName().equals(firstPet));
        System.out.println(thirdPet.equals(firstPet));


    }
}

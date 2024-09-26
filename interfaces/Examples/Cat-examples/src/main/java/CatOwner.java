public class CatOwner {

    /**** Fields ****/
    private Cat pet;



    /**** Constructors ****/
    public CatOwner(Cat pet) {
        this.pet = pet;
    }



    /**** Methods ****/

    // Methods uses the field 'pet', which is a type 'Cat'
    public void feedTheCat() {
        pet.eat();
    }


}

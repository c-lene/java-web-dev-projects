public class Main {

    public static void main(String[] args) {

        HouseCat suki = new HouseCat("Suki", 12);
        CatOwner Annie = new CatOwner(suki);

        Annie.feedTheCat();

    }
}

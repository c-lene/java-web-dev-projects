package Speech;

public class Main {
    public static void main(String[] args) {
        Message hello = new Greeting("English", "Hello Coder!");
        ((Greeting) hello).wave();
    }
}

package Speech;

public class Greeting extends Message {
    private boolean waving;


    /**** Constructors ****/
    public Greeting(String aLanguage, String aText) {
        super(aLanguage, aText);
    }

    public void wave() {
        waving = true;
    }
}

package Speech;

public class Greeting extends Message {
    private String name;


    /**** Constructors ****/
    public Greeting(String aLanguage, String aText, String aName) {
        super(aLanguage, aText);
        name = aName;
    }
}

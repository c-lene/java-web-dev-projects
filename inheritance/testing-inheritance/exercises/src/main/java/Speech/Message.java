/* CT created to answer Check Your Understanding in "A Tale of Two Cats" section */

package Speech;

public class Message {
    private boolean friendly = true;
    private String language;
    private String text;

    /**** Constructor ****/
    public Message(String aLanguage, String aText) {
        language = aLanguage;
        text = aText;
    }


    /**** Getters & Setters ****/
    public boolean isFriendly() {
        return friendly;
    }

    public String getLanguage() {
        return language;
    }

    public String getText() {
        return text;
    }
}

package org.launchcode;

public class HelloWorldConstructor {

    private String message = "Hello World";

    public HelloWorldConstructor(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String aMessage) {
        message = aMessage;
    }
}

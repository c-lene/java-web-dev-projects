package org.launchcode;

public class HelloWorld {
    public String message = "Hello World";

    public void sayHello() {
        System.out.println(message);

        // Using "this" keyword as an instance of the given class to refer to the String object 'message'
        System.out.println(this.message);
    }
}

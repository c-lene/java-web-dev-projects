package org.launchcode;

public class Greeting {
//    public String name = "Jess"
//
//    public void sayHello() {
//        System.out.println("Hello " + here.name + "!");
//    }


    // Access Modifier Example - omiting "Public" Access Modifier gives 'message' field & sayHello() default access
    String message = "Hello World";

    void sayHello() {
        System.out.println(message);
    }
}

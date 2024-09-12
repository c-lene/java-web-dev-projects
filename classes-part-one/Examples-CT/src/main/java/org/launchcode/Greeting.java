package org.launchcode;

public class Greeting {
//    public String name = "Jess"
//
//    public void sayHello() {
//        System.out.println("Hello " + here.name + "!");
//    }


//    // Access Modifier Example - omiting "Public" Access Modifier gives 'message' field & sayHello() default access
//    String message = "Hello World";
//
//    void sayHello() {
//        System.out.println(message);
//    }


    // Using "Private" Access Modifier
    // String 'message' is set to "Private" access modifier because only needs to be used by sayHello()
    private String message = "Hello World";

    // sayHello() is set to "Public" access modfier to be usable by anybody
    public void sayHello() {
        System.out.println(message);
    }
}

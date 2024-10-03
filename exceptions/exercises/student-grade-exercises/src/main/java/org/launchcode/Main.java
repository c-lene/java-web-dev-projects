package org.launchcode;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
        Divide(3,0);

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
    }

    // Changed "void" to "int"
    public static void Divide(int x, int y) {
        // Write code here!
        int result;

        if (y <= 0) {
            try {
                throw new ArithmeticException("The value of 'y' is <= 0.");
            } catch (ArithmeticException e) {
                System.out.println("The value of 'y' must be > 0.");
            }
        }

        result = x/y;
        System.out.println(result);
    }

    public static int CheckFileExtension(String fileName)
    {
        // Write code here!
    }
}
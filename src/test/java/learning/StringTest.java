package learning;

import java.util.Locale;

public class StringTest {

    public static void main(String[] args) {


        String name = "Milica Drobnjak";

        System.out.println("My name is " + name);
        System.out.println("Uppercase: " + name.toUpperCase());
        System.out.println("Lowercase: " + name.toLowerCase());
        System.out.println("Fisrt char: " + name.charAt(0));
        System.out.println("Length: " + name.length());
        System.out.println("Substring: " + name.substring(7,15));

    }
}


package com.bvan.javastart.lessons3_4.type.object_type;

/**
 * @author bvanchuhov
 */
public class StringPractice {

    public static void main(String[] args) {
        String s = "Java";

        String upperCase = s.toUpperCase();
        System.out.println(upperCase);

        System.out.println(s.charAt(0) == 'J');
        System.out.println(s.startsWith("Ja"));

        System.out.println(s.indexOf("a"));
    }
}

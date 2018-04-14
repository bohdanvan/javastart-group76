package com.bvan.javastart.lessons3_4.type.object_type;

/**
 * @author bvanchuhov
 */
public class StringExample {

    public static void main(String[] args) {
        int x = 10;

        String s = "Hello, Java!";
        int len = s.length();
        System.out.println("len = " + len);

        char c = s.charAt(2);
        System.out.println("c = " + c);

        char lastChar = s.charAt(s.length() - 1);
        System.out.println("lastChar = " + lastChar);

        System.out.println(new StringBuilder(s).reverse().toString());
    }
}

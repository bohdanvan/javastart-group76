package com.bvan.javastart.lessons3_4.type.char_type;

/**
 * @author bvanchuhov
 */
public class CharExample {

    public static void main(String[] args) {
        char c1 = 'a';
        char c2 = '\n'; // \n, \t, \\, \', \"
        char c3 = '\u1234';
        char c4 = 123;

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
        System.out.println("c4 = " + c4);

        // "D:\\"
        System.out.println("\"D:\\\\\"");
    }
}

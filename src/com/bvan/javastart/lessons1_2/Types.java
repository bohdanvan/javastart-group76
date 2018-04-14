package com.bvan.javastart.lessons1_2;

/**
 * @author bvanchuhov
 */
public class Types {

    public static void main(String[] args) {
        // Primitive types (8)

        // 1. Integer numbers (4)
        byte b = 100; // 1B, [-128 ... 127]
        short s = 10000; // 2B, ~[-30 000 ... +30 000]
        int x = 1_000_000_000; // 4B, ~[-2 000 000 000 ... +2 000 000 000]
        long l = 1000000000000000000L; // 8B

        // 2. Floating point (2)
        float f = 10.5f;
        double d = 10.5;

        // 3. Char
        char c = 'a';

        // 4. Logical
        boolean bool = true;

        // Object types
        String str = "Hello";
    }
}

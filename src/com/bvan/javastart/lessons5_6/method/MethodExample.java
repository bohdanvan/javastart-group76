package com.bvan.javastart.lessons5_6.method;

/**
 * @author bvanchuhov
 */
public class MethodExample {

    public static void main(String[] args) {
        int x = min(10, 20); // вызов метода
        int y = min(40, 30);
        System.out.println(x + y); // 40
    }

    // Creator
    public static int min(int a, int b) { // signature
        int min;
        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        return min;
    }
}

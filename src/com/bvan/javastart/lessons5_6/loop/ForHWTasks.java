package com.bvan.javastart.lessons5_6.loop;

/**
 * @author bvanchuhov
 */
public class ForHWTasks {

    public static void main(String[] args) {
        // 10, 11, 12, ... 30
        for (int n = 10; n <= 30; n++) {
            System.out.print(n + " ");
        }
        System.out.println();

        // 20, 19 ... -10
        for (int n = 20; n >= -10; n--) {
            System.out.print(n + " ");
        }
        System.out.println();

        // 10, 20, 30 ... 100
        for (int n = 10; n <= 100; n += 10) {
            System.out.print(n + " ");
        }
        System.out.println();

        // 300, 250, 200 ... -200
        for (int n = 300; n >= -200; n -= 50) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}

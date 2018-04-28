package com.bvan.javastart.lessons7_8.storing;

public class NullReference {

    public static void main(String[] args) {
        String s = null;

        if (s != null) {
            int length = s.length();
            System.out.println(length);
        } else {
            System.out.println("empty reference");
        }
    }
}

package com.company;

public class Recursive {
    public static int sum (int a) {
        if (a > 0) {
            return a + sum(a -1);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int recursionSum = sum(5);
        System.out.println("Recursion Sum = " + recursionSum);
    }
}

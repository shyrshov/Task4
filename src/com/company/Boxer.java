package com.company;

import com.sun.source.util.SourcePositions;

public class Boxer {
    public int age;
    public int weight;
    public int strength;

    public Boxer(int age, int weight, int strength) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public static boolean fight(Boxer anotherBoxer) {
        Boxer boxer = new Boxer(30, 80, 25);
        int a = boxer.age * boxer.weight * boxer.strength;
        int b = anotherBoxer.age * anotherBoxer.weight * anotherBoxer.strength;
        if (a > b) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Boxer anotherBoxer = new Boxer(32, 75, 30);
        boolean result = fight(anotherBoxer);
        System.out.println(result);
    }
}


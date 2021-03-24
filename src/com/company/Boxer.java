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

    public boolean fight(Boxer anotherBoxer) {
        int ourBoxerParameters = this.age * this.weight * this.strength;
        int otherBoxerParameters = anotherBoxer.age * anotherBoxer.weight * anotherBoxer.strength;
        if (ourBoxerParameters > otherBoxerParameters) {
            return true;
        } else {
            return false;
        }
    }
}
class Ring {
        public static void main(String[] args) {
            Boxer boxer = new Boxer(30, 80, 25);
            Boxer anotherBoxer = new Boxer(32, 75, 30);
            boolean result = boxer.fight(anotherBoxer);
            System.out.println(result);
        }
}


package com.company;

public class Overloaded {
    int firstVar;
    double secondVar;
    int thirdVar;

    public void overloaded (int firstVar, double secondVar, int thirdVar) {
        this.firstVar = firstVar;
        this.secondVar = secondVar;
        this.thirdVar = thirdVar;
    }

    public double Sum (int firstVar, double secondVar) {
        return firstVar + secondVar;
    }

    public double Sum (int firstVar, int thirdVar) {
        return firstVar + secondVar;
    }

    public double Sum (double secondVar, int thirdVar) {
        return secondVar + thirdVar;
    }

}
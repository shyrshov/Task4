package com.company;

public class StaticCalculator {
    double firstValue;
    double secondValue;
    String operation;

    public StaticCalculator() {
    }

    public StaticCalculator (double firstValue, double secondValue, String operation) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.operation= operation;
    }

    public double Calculate() {
        return switch (operation) {
            case "plus" -> firstValue + secondValue;
            case "minus" -> firstValue - secondValue;
            case "multiply" -> firstValue * secondValue;
            case "divide" -> secondValue != 0 ? firstValue / secondValue : 0;
            default -> 0;
        };
    }
}

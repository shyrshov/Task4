package com.company;

public class BunchOfConstructors {
    int firstVariable;
    double secondVariable;
    char thirdVariable;
    String fourthVariable;

    public BunchOfConstructors() {
        System.out.println("No variables");
    }

    public BunchOfConstructors(int firstVariable) {
        this.firstVariable = firstVariable;
        System.out.println("1 variable");
    }

    public BunchOfConstructors(int firstVariable, double secondVariable) {
        this(firstVariable);
        this.secondVariable = secondVariable;
        System.out.println("2 variables");
    }

    public BunchOfConstructors(int firstVariable, double secondVariable, char thirdVariable, String fourthVariable) {
        this(firstVariable, secondVariable);
        this.thirdVariable = thirdVariable;
        this.fourthVariable = fourthVariable;
        System.out.println("4 variables");
    }
    public static void main(String[] args) {
        BunchOfConstructors bunch = new BunchOfConstructors(1, 3.0, '+', "fourth");
    }
}

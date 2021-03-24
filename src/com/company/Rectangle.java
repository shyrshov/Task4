package com.company;

class Rectangle {

    double height;
    double width;

    public Rectangle(double height, double width) {
        this.width = width;
        this.height = height;
    }

    public double calculateSquare() {
        return height * width;
    }

    public void printSides() {
        System.out.println("Height: " + height + ". Width: " + width + ".");
    }

}
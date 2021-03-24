package com.company;

//has-a
class Wheels {
    public int getNumberOfWheels(){
        return 4;
    }
}

class Car {
    Wheels wheels;
    public int getNumberofWheels() {
        return wheels.getNumberOfWheels();
    }
    Car car = new Car();
    car.addEngine();

}
//uses-a
class Engine {
    public int power;
    public void addEngine () {
        System.out.println("1500sm3");
    }
}

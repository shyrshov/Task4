package com.company;

//has-a
class Wheels {
    public int getNumberOfWheels(){
        return 4;
    }
}
//uses-a
class Engine {
    public int power;
    public void addEngine () {
        System.out.println(power);
    }
}
class Car {
    Wheels wheels;
    public int getNumberofWheels() {
        return wheels.getNumberOfWheels();
    }
    Car car = new Car();
    car.addEngine(1500);
    }
}


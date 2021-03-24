package com.company;

//has-a
class Wheels {
    public int getNumberOfWheels(){
        return 4;
    }
}
//uses-a
class Garage {
    public int place;
    public void addPlace (int place) {
        this.place = place;
        System.out.println(place);
    }
}
class Car {
    Wheels wheels;
    public int getNumberofWheels() {
        return wheels.getNumberOfWheels();
    }

    public static void main(String[] args) {
        Garage garage = new Garage();
        garage.addPlace(3);
    }
}



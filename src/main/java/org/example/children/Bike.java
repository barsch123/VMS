package org.example.children;

import org.example.Vehicle;

public class Bike extends Vehicle {

    public Bike() {
    }

    public Bike(double speed, String brand, String vehicleDetails) {
        super(speed, brand, vehicleDetails);
    }


    public void move(){
        IO.println("The Bike is now moving");
    }
}

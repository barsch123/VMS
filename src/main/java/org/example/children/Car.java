package org.example.children;

import org.example.Vehicle;

public class Car extends Vehicle {

    public Car(double speed, String brand, String vehicleDetails) {
        super(speed, brand, vehicleDetails);
    }

    public Car() {
    }

    public void move(){
        IO.println("The car is now moving");
    }

    /* Fix fuel rate */
    public void calculateFuel(double distance){
        IO.println("The fix fuel distance is " + distance * 0.5);
    }

    /* Dynamic fuel rate */
    public void calculateFuel(double distance, double fuelRate){
        IO.println("The dynamic fuel rate is " + fuelRate * 0.5);
    }
}

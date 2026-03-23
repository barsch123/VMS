package org.example;

public class Vehicle {
    String brand;
    double speed;
    String vehicleDetails;

    public Vehicle(double speed, String brand, String vehicleDetails) {
        super();
        this.speed = speed;
        this.brand = brand;
        this.vehicleDetails = vehicleDetails;
    }

    public Vehicle(){
        super();
    }

    public void displayInfo() {
        IO.print("""
            Vehicle Brand: %s
            Speed: %.2f
            Details: %s
            """.formatted(brand, speed, vehicleDetails));
    }

    public void move(){
        IO.print("The vehicle is able to move");
    }

    @Override
    public String toString(){
        return ("""
            Vehicle Brand: %s
            Speed: %.2f
            Details: %s
            """.formatted(brand, speed, vehicleDetails));
    }

}

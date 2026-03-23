package org.example;

import org.example.children.Bike;
import org.example.children.Car;

import java.util.StringTokenizer;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        String vehicleDetails;
        String brand = "Toyota";
        double speed = 20;
        String color = "blue";
        vehicleDetails = "Toyota-180-Red";

        /* String Tokenizer*/
        StringTokenizer st = new StringTokenizer(vehicleDetails, ",- ");
        while (st.hasMoreTokens()) {
            IO.println(st.nextToken());
        }

        Vehicle childBike = new Bike(50, "Toyota", vehicleDetails);
        Car childCar = new Car();

        /* String Buffer implementation*/
        StringBuffer report = new StringBuffer();
        report.append("Vehicle Details: ");
        report.append("Brand = ").append(brand).append(", ");
        report.append("Speed = ").append(speed).append(", ");
        report.append("Color = ").append(color).append(", ");

        /*  String report = "Vehicle Details: " +
                "Brand = " + brand + ", " +
                "Speed = " + speed + ", " +
                "Color = " + color;
        */
        IO.println(report.toString());
        childBike.move();
        childCar.move();
        childCar.calculateFuel(200);
        childCar.calculateFuel(200, 13.2);

    }
}

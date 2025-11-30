package oop_projects;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("Toyota", "Corolla", 300));
        vehicles.add(new Bike("Yamaha", "R3", 150));
        vehicles.add(new Truck("Volvo", "FH16", 800));

        for (Vehicle v : vehicles) {
            System.out.println(v.brand +"'s rental price for 5 days is:  "+ v.getRentalPrice(5)+"dh");
        }
    }
}

package com.driver;

public interface WaterVehicle 
{
    public String getVehicleName();
    public int getVehicleCapacity();
}
// Implementing the Boat class
public class Boat implements WaterVehicle 
{
    private String name;
    private int capacity;

    // Constructor
    public Boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Implementing getVehicleName
    @Override
    public String getVehicleName() {
        return name;
    }

    // Implementing getVehicleCapacity
    @Override
    public int getVehicleCapacity() {
        return capacity;
    }

    // Optional: Additional methods if needed
    @Override
    public String toString() {
        return "Boat{name='" + name + "', capacity=" + capacity + "}";
    }
}

    public class Main {
    public static void main(String[] args) {
        Boat boat = new Boat("Sea Explorer", 20);

        System.out.println("Boat Name: " + boat.getVehicleName());
        System.out.println("Boat Capacity: " + boat.getVehicleCapacity());
    }
}


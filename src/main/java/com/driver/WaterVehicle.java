package com.driver;

public interface WaterVehicle 
{
    private String getVehicleName();
    private int getVehicleCapacity();
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


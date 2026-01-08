package com.example.demo.beans;

public class Engine {
    private String Name;
    private String fuel;


    public Engine(String name, String fuel) {
        Name = name;


    }

    public Engine() {

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }



    @Override
    public String toString() {
        return "Engine{" +
                "Name='" + Name + '\'' +
                ", fuel='" + fuel + '\'' +

                '}';
    }
}

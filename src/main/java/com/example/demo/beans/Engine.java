package com.example.demo.beans;

public class Engine {
    private String Name;
    private String fuel;
    private String hp;

    public Engine(String name, String fuel, String hp) {
        Name = name;
        this.fuel = fuel;
        this.hp = hp;
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

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "Name='" + Name + '\'' +
                ", fuel='" + fuel + '\'' +
                ", hp='" + hp + '\'' +
                '}';
    }
}

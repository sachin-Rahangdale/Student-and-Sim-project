package com.example.demo.Model;


import com.example.demo.beans.Engine;
import com.example.demo.beans.Sim;

public class Car {
    private String Name;
    private String Brand;

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    private Engine engine;

    public Car() {

    }

    public Car(String name, String brand) {
        Name = name;
        Brand = brand;

    }


    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }


    @Override
    public String toString() {
        return "Car{" +
                "Name='" + Name + '\'' +
                ", Brand='" + Brand + '\'' +
                ", engine=" + engine +
                '}';
    }


}
    // spring container inversion od control lifecycle of bean


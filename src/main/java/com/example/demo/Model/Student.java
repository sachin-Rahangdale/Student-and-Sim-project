package com.example.demo.Model;

import com.example.demo.beans.Sim;

public class Student {
    private String name;
    private String address;
    private Sim sim;

    public Student(String name, String address) {
        this.name = name;
        this.address = address;

    }

    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Sim getSim() {
        return sim;
    }

    public void setSim(Sim sim) {
        this.sim = sim;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", sim=" + sim +
                '}';
    }
}
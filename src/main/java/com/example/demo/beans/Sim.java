package com.example.demo.beans;

public class Sim {
    private String name;
    private String number;

    public Sim(String number, String name) {
        this.number = number;
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void calling (){
        System.out.println("Calling via sim......"+name+"   " +"and number   : "+number);

    }
    public Sim(){

    }

    @Override
    public String toString() {
        return "Sim{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
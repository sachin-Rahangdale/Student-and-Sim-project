package com.example.demo.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Truck {
    public Starter starter;

    public Truck(Starter starter) {
        this.starter = starter;
    }


    public void truckStart(){
        this.starter.startMotor();
        System.out.println(" dhu dhu dhud dhu");

    }
}

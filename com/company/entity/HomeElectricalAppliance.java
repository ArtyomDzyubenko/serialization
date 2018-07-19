package com.company.entity;

import java.io.Serializable;

public abstract class HomeElectricalAppliance implements Serializable {
    private static long counter;
    private final long serialVersionUID = counter++;

    private int power;
    private ApplianceState state;


    public HomeElectricalAppliance(){

    }

    public HomeElectricalAppliance(int power, ApplianceState state){
        this.power = power;
        this.state = state;
    }


    public void setPower(int power) {
        this.power = power;
    }

    public void setState(ApplianceState state) {
        this.state = state;
    }

    public int getPower() {
        return power;
    }

    public ApplianceState getState() {
        return state;
    }


    @Override
    public String toString() {
        return  getClass().getName() +  "\nUID: " + serialVersionUID + "\npower: " + power + "\nstate: " + state;
    }
}

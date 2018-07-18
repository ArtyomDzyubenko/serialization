package com.company.entity;

import java.io.Serializable;

public class TVSet extends HomeElectricalAppliance implements Serializable {
    private double diagonal;
    private String screenType;

    public TVSet(){

    }

    public TVSet(int power, ApplianceState state, double diagonal, String screenType){
        super(power, state);
        this.diagonal = diagonal;
        this.screenType = screenType;
    }

    @Override
    public String toString() {
        return super.toString() + "diagonal: " + diagonal + "\nscreen type: " + screenType;
    }
}

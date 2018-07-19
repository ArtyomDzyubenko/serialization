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


    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public void setScreenType(String screenType) {
        this.screenType = screenType;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public String getScreenType() {
        return screenType;
    }

    @Override
    public String toString() {
        return super.toString() + "\ndiagonal: " + diagonal + "\nscreen type: " + screenType;
    }
}

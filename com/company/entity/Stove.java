package com.company.entity;

import java.io.Serializable;

public class Stove extends HomeElectricalAppliance implements Serializable {
    private int burnerNumber;
    private boolean ovenIncluded;


    public Stove(){

    }

    public Stove(int power, ApplianceState state, int burnerNumber, boolean ovenIncluded){
        super(power, state);
        this.burnerNumber = burnerNumber;
        this.ovenIncluded = ovenIncluded;
    }


    public void setBurnerNumber(int burnerNumber) {
        this.burnerNumber = burnerNumber;
    }

    public void setOvenIncluded(boolean ovenIncluded) {
        this.ovenIncluded = ovenIncluded;
    }

    public int getBurnerNumber() {
        return burnerNumber;
    }

    public boolean isOvenIncluded() {
        return ovenIncluded;
    }


    @Override
    public String toString() {
        return super.toString() + "\nburner number: " + burnerNumber + "\noven included: " + ovenIncluded;
    }
}

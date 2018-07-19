package com.company.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class HomeElectricalAppliances extends ArrayList<HomeElectricalAppliance> implements  Serializable {
    private ArrayList<HomeElectricalAppliance> homeElectricalAppliances = new ArrayList<>();


    public HomeElectricalAppliances(){

    }

    public HomeElectricalAppliances(ArrayList homeElectricAppliances){
        this.homeElectricalAppliances = homeElectricAppliances;
    }


    @Override
    public boolean add(HomeElectricalAppliance homeElectricalAppliance) {
        return homeElectricalAppliances.add(homeElectricalAppliance);
    }

    @Override
    public boolean remove(Object o) {
        return homeElectricalAppliances.remove(o);
    }

    @Override
    public Iterator<HomeElectricalAppliance> iterator() {
        return homeElectricalAppliances.iterator();
    }
}

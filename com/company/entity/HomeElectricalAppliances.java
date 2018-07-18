package com.company.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class HomeElectricalAppliances implements /*Iterator,*/ Serializable {
    private ArrayList<HomeElectricalAppliance> homeElectricalAppliances = new ArrayList<>();
    //private Iterator iterator = homeElectricalAppliances.iterator();


    public HomeElectricalAppliances(){

    }

    public HomeElectricalAppliances(ArrayList homeElectricAppliances){
        this.homeElectricalAppliances = homeElectricAppliances;
    }


    public void add(HomeElectricalAppliance homeElectricalAppliance) {
        homeElectricalAppliances.add(homeElectricalAppliance);
    }

    public void remove(HomeElectricalAppliance homeElectricalAppliance){
        homeElectricalAppliances.remove(homeElectricalAppliance);
    }

    public Iterator getIterator(){
        return homeElectricalAppliances.iterator();
    }

    /*@Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public Object next() {
        return iterator.next();
    }

    @Override
    public void remove() {
        iterator.remove();
    }*/
}

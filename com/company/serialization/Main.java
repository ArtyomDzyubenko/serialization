package com.company.serialization;

import com.company.entity.*;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws InvalidObjectException {
        HomeElectricalAppliance tv = new TVSet(200, ApplianceState.OFF, 110, "LED");
        HomeElectricalAppliance stove = new Stove(2500, ApplianceState.ON, 4, true);

        System.out.println("---BEFORE SERIALIZATION---");

        System.out.println(tv.toString());
        System.out.println(stove.toString());

        HomeElectricalAppliances homeElectricalAppliances = new HomeElectricalAppliances();
        homeElectricalAppliances.add(tv);
        homeElectricalAppliances.add(stove);

        Serializer serializer = new Serializer<HomeElectricalAppliances>();

        serializer.serialize(homeElectricalAppliances, "D:\\object.txt");
        HomeElectricalAppliances deserialized = (HomeElectricalAppliances)serializer.deserialize("D:\\object.txt");

        System.out.println("---AFTER DESERIALIZATION---");

        Iterator iterator = deserialized.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }
}

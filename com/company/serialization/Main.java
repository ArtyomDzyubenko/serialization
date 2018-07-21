package com.company.serialization;

import com.company.entity.*;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws IOException {
        String fileName = "D:\\object.txt";

        HomeElectricalAppliance tv = new TVSet(200, ApplianceState.OFF, 110, "LED");
        HomeElectricalAppliance stove = new Stove(2500, ApplianceState.ON, 4, true);

        System.out.println("---BEFORE SERIALIZATION---");

        HomeElectricalAppliances homeElectricalAppliances = new HomeElectricalAppliances();
        homeElectricalAppliances.add(tv);
        homeElectricalAppliances.add(stove);

        Iterator i = homeElectricalAppliances.iterator();

        while(i.hasNext()){
            System.out.println(i.next().toString());
        }

        Serializer serializer = new Serializer<HomeElectricalAppliances>();

        serializer.serialize(homeElectricalAppliances, fileName);
        HomeElectricalAppliances deserialized = (HomeElectricalAppliances)serializer.deserialize(fileName);

        System.out.println("---AFTER DESERIALIZATION---");

        Iterator iterator = deserialized.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
    }
}

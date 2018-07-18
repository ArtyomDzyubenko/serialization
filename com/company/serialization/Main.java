package com.company.serialization;

import com.company.entity.*;

import java.io.InvalidObjectException;
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

        Serializator.serialize(homeElectricalAppliances, "D:\\object.txt");
        HomeElectricalAppliances deserializable = Serializator.deserializeCollection("D:\\object.txt");

        System.out.println("---AFTER SERIALIZATION---");

        /*Iterator iterator = deserializable.getHomeElectricalAppliances().iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }*/

        Iterator iterator = deserializable.getIterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
}

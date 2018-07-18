package com.company.serialization;

import com.company.entity.ApplianceState;
import com.company.entity.HomeElectricalAppliance;
import com.company.entity.TVSet;

import java.io.InvalidObjectException;

public class Main {

    public static void main(String[] args) throws InvalidObjectException {
        HomeElectricalAppliance homeElectricalAppliance = new TVSet(200, ApplianceState.OFF, 110, "LED");
        Serializator.serialize(homeElectricalAppliance, "D:\\object.txt");
        HomeElectricalAppliance deserializable = Serializator.deserialize("D:\\object.txt");

        System.out.println(deserializable.toString());
    }
}

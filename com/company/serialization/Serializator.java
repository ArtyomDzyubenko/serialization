package com.company.serialization;

import com.company.entity.HomeElectricalAppliance;

import java.io.*;

public class Serializator {
    public static boolean serialize(HomeElectricalAppliance homeElectricalAppliance, String fileName){
        boolean success = false;
        File file = new File(fileName);
        ObjectOutputStream objectOutputStream = null;

        try(FileOutputStream fileOutputStream = new FileOutputStream(file)){
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(homeElectricalAppliance);
            success = true;
        } catch (FileNotFoundException e) {
            System.out.println("file not found.");
        } catch (NotSerializableException e) {
            System.out.println("object not serializable.");
        } catch (IOException e) {
            System.out.println("IO error.");
        }

        return success;
    }

    public static HomeElectricalAppliance deserialize(String fileName) throws InvalidObjectException {
        File file = new File(fileName);
        ObjectInputStream objectInputStream = null;

        try(FileInputStream fileInputStream = new FileInputStream(fileName)){
            objectInputStream = new ObjectInputStream(fileInputStream);
            HomeElectricalAppliance homeElectricalAppliance = (HomeElectricalAppliance)objectInputStream.readObject();
            return homeElectricalAppliance;
        } catch (FileNotFoundException e) {
            System.out.println("file not found.");
        } catch (IOException e) {
            System.out.println("IO error.");
        } catch (ClassNotFoundException e) {
            System.out.println("class not exist.");
        }

        throw new InvalidObjectException("object not extracted.");
    }
}

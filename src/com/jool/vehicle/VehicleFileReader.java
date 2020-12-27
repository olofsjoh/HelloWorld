package com.jool.vehicle;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class VehicleFileReader {
    public ArrayList<Vehicle> getVehicles(){
        ArrayList<Vehicle> result = new ArrayList<>();

        List<String> allLines = readAllLines();

        if (allLines != null){
            for (String line : allLines) {
                String[] rowData = line.split("\t");
                Integer id = Integer.parseInt(rowData[0]);
                String car = rowData[1].toUpperCase();

                CarEnum x = CarEnum.get(car);
                if (x != null){
                    x.setId(id);
                    result.add(x);
                } else {
                    System.out.println("Unable to parse " + car);
                }
            }
        }
        return result;
    }
    private List<String> readAllLines(){

        String path = "C:/temp/vehicles.txt";

        try {
            return Files.readAllLines(Paths.get(path));
        } catch (IOException e) {
            System.out.println(e.toString());
        }
        return null;
    }
}




package com.example.helloworld;

public class InstanceCounter {
    private static int numInstances = 0;

    private static void addInstance(){
        numInstances = numInstances +1;
    }

    InstanceCounter(){
        InstanceCounter.addInstance();
    }

    protected static int getCount(){
        return numInstances;
    }

    public void PrintCount(){

        System.out.println("Created " +
        InstanceCounter.getCount() + " objects");
    }
}

package com.example.helloworld;

import java.awt.*;

public class Arrays {
    public void testArrays(){
       int[] dever = {2_100_100, 2_900_000, 6_100_000};
       int[] philadephia = new int[dever.length];
       int[] total = new int[dever.length];

       int average;

       philadephia[0] = dever[0] + philadephia[0];
       philadephia[1] = dever[1] + philadephia[1];
       philadephia[2] = dever[2] + philadephia[2];

       total[0] = dever[0] +  philadephia[0];
       total[1] = dever[1] +  philadephia[1];
       total[2] = dever[2] +  philadephia[2];

       average = (total[0] + total[1]+ total[2]) / 3;

       System.out.print("2016 production: ");
       System.out.format("%,d%n",total[0]);

        System.out.print("2017 production: ");
        System.out.format("%,d%n",total[1]);

        System.out.print("2018 production: ");
        System.out.format("%,d%n",total[2]);

        System.out.print("Average production: ");
        System.out.format("%,d%n",average);



    }
}

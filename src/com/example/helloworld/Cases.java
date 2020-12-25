package com.example.helloworld;

public class Cases{
    public void test(){
        float x = 9;
        float y = 5;
        int z = (int)(x / y);
        switch (z) {
            case 1:
                x = x + 2;
                break;
            case 2:
                x = x + 3;
                break;
            default:
                x = x + 1;
                break;
        }
        System.out.println("Value of x: " + x);
    }
}
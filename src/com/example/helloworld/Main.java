package com.example.helloworld;
import org.jool.ecommerce.*;

//import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        StoreFront storeFront = new StoreFront();
        storeFront.addItem("CO1", "MUG", "9.99", "150");
        storeFront.addItem("CO2", "LG MUG", "12.99", "82");
        storeFront.addItem("CO3", "MOUSE PAD", "10.49", "800");
        storeFront.addItem("DO1", "T SHIRT", "16.99", "90");

        for(int i=0; i< storeFront.getSize(); i++){
            Item item = storeFront.getItem(i);
            System.out.println("\nItem ID: " + item.getId() +
                               "\nName: " + item.getName() +
                               "\nRetail Price: $" + item.getRetail() +
                               "\nPrice: $" + item.getPrice() +
                               "\nQuantity: " + item.getQuantity());

        }
    }
}



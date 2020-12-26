package org.jool.ecommerce;

import java.util.*;

public class StoreFront {
    private final LinkedList catalog = new LinkedList();

    public void addItem(String id, String name, String price, String quant) {
        Item item = new Item(id,name,price, quant);
        catalog.add(item);
    }

    public Item getItem(int i) {
        return (Item) catalog.get(i);
    }

    public int getSize(){
        return catalog.size();
    }

    public void sort() {
        Collections.sort(catalog);
    }
}

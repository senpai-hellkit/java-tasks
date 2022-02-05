package app.cart;

import app.cart.item.Item;

import java.util.ArrayList;

public class Cart{
    public ArrayList<Item> items;

    public void add(Item item){
        this.items.add(item);
    }
    public void remove(Item item){
        this.items.remove(item);
    }

}
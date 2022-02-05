package app;

import app.cart.item.Item;
import app.ordprod.Product;
import app.serializespcg.Deserializer;
import app.serializespcg.Serializer;

import java.util.ArrayList;

public class View {
    protected ArrayList<Item> items;
    private void create() {
        String fileName = "PRODUCTS.dat";
        new Serializer().writeProducts(fileName);
        for(Product product: new Deserializer().readProducts(fileName)){
            this.items.add(new Item(product.getId(), 11));
        }
    }
    public void show(){
        this.create();
        for(Item item: this.items){
            System.out.println("Продукт " + item.getId() + " кол-во: " + item.getCount());
        }
    }
}

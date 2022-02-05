package app.ordprod;

import java.io.Serializable;

public class Product implements Serializable {
    protected int id;
    protected String title;
    protected String description;
    protected double volume;
    protected int price;
    protected boolean isInStock;

    public Product(int id, String title, String description,
                   double volume, int price, boolean isInStock) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.volume = volume;
        this.price = price;
        this.isInStock = isInStock;
    }

    public int getId() {
        return id;
    }

    public double getVolume() {
        return volume;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getTitle() {
        return title;
    }
}
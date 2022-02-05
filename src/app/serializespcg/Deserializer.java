package app.serializespcg;

import app.ordprod.Product;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Deserializer {
    public ArrayList<Product> readProducts(String fileName) {
        ArrayList<Product> products = new ArrayList<>();
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            products.add((Product) objectInputStream.readObject());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return products;
    }
}

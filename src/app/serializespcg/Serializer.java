package app.serializespcg;

import app.ordprod.Product;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serializer {
    public void writeProducts(String to){
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(to)))
        {
            for(int count = 1; count<=10; count++){
                Product product = new Product(
                        count,"продукт " + count,
                        "описание продукта № " + count,
                        0.5, 100, true
                ); objectOutputStream.writeObject(product);
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
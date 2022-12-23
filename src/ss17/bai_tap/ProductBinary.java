package ss17.bai_tap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductBinary {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Acer2", "Acer", 1000));
        products.add(new Product(2, "Asus3", "Asus", 2200));
        products.add(new Product(3, "PHP4", "PHP", 3000));

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("D:\\Codegym\\Module_2\\src\\ss17\\bai_tap\\Product.csv");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(products);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fileInputStream = new FileInputStream("D:\\Codegym\\Module_2\\src\\ss17\\bai_tap\\Product.csv");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            List<Product> productsList = (List<Product>) objectInputStream.readObject();
            for (Product product : productsList) {
                System.out.println(product);
            }
            objectInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

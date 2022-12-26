package ss17.bai_tap.controller;

import ss17.bai_tap.model.Product;
import ss17.bai_tap.service.ProductService;

import java.io.*;
import java.util.Scanner;

public class ProductBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choose;
        ProductService productService = new ProductService();
        productService.them(new Product(1, "Acer2", "Acer", 1000));
        productService.them(new Product(2, "Asus3", "Asus", 2200));
        productService.them(new Product(3, "PHP4", "PHP", 3000));

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("D:\\Codegym\\Module_2\\src\\ss17\\bai_tap\\Product.csv");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(productService);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fileInputStream = new FileInputStream("D:\\Codegym\\Module_2\\src\\ss17\\bai_tap\\Product.csv");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            ProductService productsList = (ProductService) objectInputStream.readObject();
            do {
                System.out.println("-----Menu-----\n" +
                        "1. Add product.\n" +
                        "2. Display list product\n" +
                        "3. Find product by name.\n" +
                        "4. Exit\n");
                choose = Integer.parseInt(sc.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("Product you want to add\n" +
                                "ID: ");
                        int id1 = Integer.parseInt(sc.nextLine());
                        System.out.println("Name product: ");
                        String name1 = sc.nextLine();
                        System.out.println("Name brand: ");
                        String brand1 = sc.nextLine();
                        System.out.println("Price: ");
                        int price1 = Integer.parseInt(sc.nextLine());
                        Product product1 = new Product(id1, name1, brand1, price1);
                        productsList.them(product1);
                        break;
                    case 2:
                        productsList.display();
                        break;
                    case 3:
                        System.out.println("Name you want to find: ");
                        String name3 = sc.nextLine();
                        productsList.find(name3);
                }
            } while (choose < 4);
            objectInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

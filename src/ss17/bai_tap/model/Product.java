package ss17.bai_tap.model;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String nameProduct;
    private String brand;
    private int price;

    public Product() {
    }

    public Product(int id, String nameProduct, String brand, int price) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.brand = brand;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", nameProduct='" + nameProduct + '\'' +
                ", brand='" + brand + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}

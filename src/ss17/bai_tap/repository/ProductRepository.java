package ss17.bai_tap.repository;

import ss17.bai_tap.model.Product;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository, Serializable {
    List<Product> productList = new ArrayList<>();

    @Override
    public void them(Product product) {
        productList.add(product);
    }

    @Override
    public void display() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }

    @Override
    public void find(String name) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getNameProduct().contains(name)) {
                System.out.println(productList.get(i));
            }
        }
    }
}

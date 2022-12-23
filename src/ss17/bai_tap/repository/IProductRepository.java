package ss17.bai_tap.repository;

import ss17.bai_tap.model.Product;

public interface IProductRepository {
    void them(Product product);

    void display();

    void find(String name);
}

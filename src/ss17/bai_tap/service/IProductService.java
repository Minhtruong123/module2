package ss17.bai_tap.service;

import ss17.bai_tap.model.Product;

public interface IProductService {
    void them(Product product);

    void display();

    void find(String name);
}

package ss17.bai_tap.service;

import ss17.bai_tap.model.Product;
import ss17.bai_tap.repository.IProductRepository;
import ss17.bai_tap.repository.ProductRepository;

import java.io.Serializable;

public class ProductService implements IProductService, Serializable {
    IProductRepository productRepository = new ProductRepository();

    @Override
    public void them(Product product) {
        productRepository.them(product);
    }

    @Override
    public void display() {
        productRepository.display();
    }

    @Override
    public void find(String name) {
        productRepository.find(name);
    }
}

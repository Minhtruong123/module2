package ss12.bai_tap.model.service;

import ss12.bai_tap.model.model.Product;
import ss12.bai_tap.model.repository.IProductRepository;
import ss12.bai_tap.model.repository.ProductRepository;

public class ProductManager extends Product implements IProductManager {

    private IProductRepository repository = new ProductRepository();


    @Override
    public void menu() {
        repository.menu();
    }

    @Override
    public void them(Product product) {
        repository.them(product);
    }

    @Override
    public void xoa(int index) {
        repository.xoa(index);
    }

    @Override
    public void change(int index, Product product) {
        repository.change(index, product);
    }

    @Override
    public void display() {
        repository.display();
    }

    @Override
    public void find(String name) {
        repository.find(name);
    }

    @Override
    public void sort() {
        repository.sort();
    }

    //Validation
}

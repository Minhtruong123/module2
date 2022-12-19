package ss12.bai_tap.model.service;

import ss12.bai_tap.model.model.Product;
import ss12.bai_tap.model.repository.IProductRepository;
import ss12.bai_tap.model.repository.ProductRepository;

public class ProductService extends Product implements IProductService {

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
    public Product findProduct(int id) {
        return repository.findProduct(id);
    }

    @Override
    public void findByKeyWord(String str) {
        repository.findByKeyWord(str);
    }

    @Override
    public void change(Product product) {
        repository.change(product);
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

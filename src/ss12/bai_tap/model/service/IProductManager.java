package ss12.bai_tap.model.service;

import ss12.bai_tap.model.model.Product;

public interface IProductManager {
    void menu();

    void them(Product product);

    void change(int index, Product product);

    void display();

    void find(String name);

    void sort();

}

package ss12.bai_tap.model.repository;

import ss12.bai_tap.model.model.Product;

public interface IProductRepository {
    void menu();

    void them(Product product);

    void xoa(int index);

    void change(int index, Product product);

    void display();

    void find(String name);

    void sort();
}

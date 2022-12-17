package ss12.bai_tap.model.repository;

import ss12.bai_tap.model.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductRepositoryImp implements IProductRepository {
    List<Product> productList = new ArrayList<>();
    Product product1 = new Product(1, "LV", 1000);
    Product product2 = new Product(2, "Gucci", 2000);
    Product product3 = new Product(3, "Channel", 3000);

    {
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
    }


    public void menu() {
        System.out.println("Chọn phương thức bạn muốn: \n" +
                "1.Thêm sản phẩm.\n" +
                "2.Sửa sản phẩm.\n" +
                "3.Hiển thị sản phẩm.\n" +
                "4.Tìm kiếm sản phẩm.\n" +
                "5.Sắp xếp sản phẩm.\n" +
                "6.Xóa sản phẩm.\n" +
                "7.Thoát.\n");
    }

    public void them(Product product) {
        productList.add(product);
    }

    public void xoa(int index){
        productList.remove(index);
    }

    public void change(int index, Product product) {
        productList.set(index, product);
    }

    public void display() {
        for (int i = 0; i < productList.size(); i++) {
            System.out.println(productList.get(i));
        }

    }

    public void find(String name) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getNameProduct().contains(name)) {
                System.out.println(productList.get(i));
            }
        }
    }

    public void sort() {
        Collections.sort(productList, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return o1.getId() - o2.getId();
            }
        });
    }

}
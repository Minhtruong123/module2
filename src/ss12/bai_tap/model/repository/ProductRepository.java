package ss12.bai_tap.model.repository;

import ss12.bai_tap.model.model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductRepository implements IProductRepository {
    static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "LV", 1000));
        productList.add(new Product(2, "Gucci", 2000));
        productList.add(new Product(3, "Channel", 3000));
    }


    public void menu() {
        System.out.println("Chọn phương thức bạn muốn: \n" +
                "1.Thêm sản phẩm.\n" +
                "2.Sửa sản phẩm.\n" +
                "3.Hiển thị sản phẩm.\n" +
                "4.Tìm kiếm sản phẩm.\n" +
                "5.Sắp xếp sản phẩm theo giá.\n" +
                "6.Xóa sản phẩm.\n" +
                "7.Tìm sản phẩm theo tên gần đúng.\n" +
                "8.Thoát.\n");
    }

    public void them(Product product) {
        productList.add(product);
    }

    public void xoa(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                productList.remove(i);
            }
        }
    }

    @Override
    public Product findProduct(int id) {
        for (Product product : productList) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void findByKeyWord(String str) {
        boolean check = false;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getNameProduct().contains(str)) {
                System.out.println(productList.get(i));
                check = true;
            }
        }
        if (!check) System.out.println("Không có sản phẩm cần tìm");
    }


    public void change(Product product) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == product.getId()) {
                productList.set(i, product);
                break;
            }
        }
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
                return o1.getPrice() - o2.getPrice();
            }
        });
    }

}

package ss12.bai_tap.controller;

import ss12.bai_tap.model.model.Product;
import ss12.bai_tap.model.service.ProductService;

import java.util.Scanner;

public class ProductController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductService productManager = new ProductService();
        int choice;
        do {
            productManager.menu();
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Sản phẩm bạn muốn thêm");
                    System.out.println("Id: ");
                    int id = Integer.parseInt(sc.nextLine());
                    System.out.println("Tên sản phẩm: ");
                    String nameProduct = sc.nextLine();
                    System.out.println("Giá tiền: ");
                    int price = Integer.parseInt(sc.nextLine());
                    Product product = new Product(id, nameProduct, price);
                    productManager.them(product);
                    break;
                case 2:
                    System.out.println("Nhập id sản phẩm bạn muốn đổi: ");
                    System.out.println("Id: ");
                    int id2 = Integer.parseInt(sc.nextLine());
                    Product product2 = productManager.findProduct(id2);
                    if (product2 != null) {
                        System.out.println("Tên sản phẩm: ");
                        String nameProduct2 = sc.nextLine();
                        System.out.println("Giá tiền: ");
                        int price2 = Integer.parseInt(sc.nextLine());
                        Product product1 = new Product(id2, nameProduct2, price2);
                        productManager.change(product1);
                    } else System.out.println("Không có id cần tìm");
                    break;
                case 3:
                    productManager.display();
                    break;
                case 4:
                    System.out.println("Nhập sản phẩm bạn muốn tìm kiếm: ");
                    System.out.println("Tên sản phẩm: ");
                    String nameProduct4 = sc.nextLine();
                    productManager.find(nameProduct4);
                    break;
                case 5:
                    productManager.sort();
                    break;
                case 6:
                    System.out.println("Nhập id sản phẩm cần xóa: ");
                    int id6 = Integer.parseInt(sc.nextLine());
                    Product product6 = productManager.findProduct(id6);
                    if (product6 != null) {
                        productManager.xoa(id6);
                    } else System.out.println("Không có id sản phẩm cần xóa");
                    break;
                case 7:
                    System.out.println("Nhập chuỗi: ");
                    String str = sc.nextLine();
                    productManager.findByKeyWord(str);
            }
        } while (choice < 8);
    }
}

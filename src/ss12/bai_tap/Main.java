package ss12.bai_tap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
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
                    System.out.println("Nhập sản phẩm bạn muốn đổi: ");
                    System.out.println("Id: ");
                    int id2 = Integer.parseInt(sc.nextLine());
                    System.out.println("Tên sản phẩm: ");
                    String nameProduct2 = sc.nextLine();
                    System.out.println("Giá tiền: ");
                    int price2 = Integer.parseInt(sc.nextLine());
                    System.out.println("Vị trí muốn đổi: ");
                    int index = Integer.parseInt(sc.nextLine());
                    Product product2 = new Product(id2, nameProduct2, price2);
                    productManager.change(index, product2);
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
            }
        } while (choice < 6);
    }
}

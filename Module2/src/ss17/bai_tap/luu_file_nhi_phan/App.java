package ss17.bai_tap.luu_file_nhi_phan;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Scanner scanner = new Scanner(System.in);
        String filename = "products.dat";

        while (true) {
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiển thị sản phẩm");
            System.out.println("3. Tìm kiếm sản phẩm");
            System.out.println("4. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = Integer.parseInt(scanner.nextLine());


            switch (choice) {
                case 1:
                    System.out.print("Nhập mã sản phẩm: ");
                    String productId = scanner.nextLine();
                    System.out.print("Nhập tên sản phẩm: ");
                    String productName = scanner.nextLine();
                    System.out.print("Nhập giá sản phẩm: ");
                    double price = scanner.nextDouble();
                    scanner.nextLine(); // Clear buffer
                    System.out.print("Nhập hãng sản xuất: ");
                    String manufacturer = scanner.nextLine();
                    System.out.print("Nhập mô tả sản phẩm: ");
                    String description = scanner.nextLine();

                    Product newProduct = new Product(productId, productName, price, manufacturer, description);
                    productManager.writeProductToFile(newProduct, filename);
                    System.out.println("Sản phẩm đã được thêm thành công!");
                    break;
                case 2:
                    List<Product> products = productManager.readProductsFromFile(filename);
                    for (Product product : products) {
                        System.out.println(product);
                    }
                    break;
                case 3:
                    System.out.print("Nhập mã sản phẩm cần tìm: ");
                    String searchId = scanner.nextLine();
                    Product foundProduct = productManager.findProductById(searchId, filename);
                    if (foundProduct != null) {
                        System.out.println("Thông tin sản phẩm: " + foundProduct);
                    } else {
                        System.out.println("Không tìm thấy sản phẩm.");
                    }
                    break;
                case 4:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        }
    }
}




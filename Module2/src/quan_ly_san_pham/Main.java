package quan_ly_san_pham;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager manager = new ProductManager();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("menu quản lý sản phẩm");
            System.out.println("1.thêm sản phẩm mới");
            System.out.println("2.hiển thị danh sách sản phẩm ");
            System.out.println("3.xóa sản phẩm ");
            System.out.println("4.sửa thông tin sản phẩm ");
            System.out.println("5.tìm sản phẩm theo tên ");
            System.out.println("6.sắp xếp sản phẩm theo thứ tự  ");
            System.out.println("7.thoát");
            System.out.print("chọn:");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    addProduct(sc, manager);
                    break;
                case 2:
                    manager.displayProductsList();
                    break;
                case 3:
                    deleteProduct(sc, manager);
                    break;
                case 4:
                    updateProduct(sc, manager);
                    break;
                case 5:
                    findProduct(sc, manager);
                    break;
                case 6:
                    manager.sortProducts();
                    manager.displayProductsList();
                    break;
                case 7:
                    System.exit(0);

            }
        }

    }

    private static void findProduct(Scanner sc, ProductManager manager) {
        System.out.println("nhập tên cần tìm");
        String findName = sc.nextLine();
        manager.displayProducts(findName);
    }

    private static void updateProduct(Scanner sc, ProductManager manager) {
        System.out.println("nhập id muốn sửa");
        int updateId = Integer.parseInt(sc.nextLine());
        System.out.println("nhập tên mới");
        String newName = sc.nextLine();
        System.out.println("nhập giá mới");
        int newPrice = Integer.parseInt(sc.nextLine());
        manager.updateProduct(updateId, newName, newPrice);
    }

    private static void deleteProduct(Scanner sc, ProductManager manager) {
        manager.displayProductsList();
        System.out.println("nhập id muốn xóa");
        int deleteId = Integer.parseInt(sc.nextLine());
        System.out.println("bạn có chắc chắn muốn xóa");
        System.out.println("1.có");
        System.out.println("2.không");
        int choice2 = Integer.parseInt(sc.nextLine());
        switch (choice2) {
            case 1:
                manager.deleteProduct(deleteId);
                break;
            case 2:
                break;
            default:
                System.out.println("vui lòng nhập đúng yêu cầu");
        }
    }

    private static void addProduct(Scanner sc, ProductManager manager) {
        System.out.println("nhập id");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("nhập tên");
        String name = sc.nextLine();
        System.out.println("nhập giá");
        int price = Integer.parseInt(sc.nextLine());
        manager.addProduct(new Product(id, name, price));
    }
}

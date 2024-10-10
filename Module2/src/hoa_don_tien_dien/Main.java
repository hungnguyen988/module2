package hoa_don_tien_dien;

import hoa_don_tien_dien.view.BillView;
import hoa_don_tien_dien.view.CustomerView;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        BillView billView = new BillView();
        CustomerView customerView = new CustomerView();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Chương trình quản lý hóa đơn tiền điện");
            System.out.println("1. Quản lý khách hàng");
            System.out.println("2. Quản lý hóa đơn");
            System.out.println("3. Thoát");
            System.out.print("Chọn:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    customerView.displayMenu();
                    break;
                case 2:
                    billView.displayMenuBill();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Chọn sai, vui lòng chọn lại.");
            }
        }

    }
}

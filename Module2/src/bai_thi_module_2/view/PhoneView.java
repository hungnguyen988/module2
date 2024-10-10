package bai_thi_module_2.view;

import bai_thi_module_2.controller.GenuinePhoneController;
import bai_thi_module_2.controller.PortablePhoneController;
import bai_thi_module_2.model.GenuinePhone;
import bai_thi_module_2.model.Phone;
import bai_thi_module_2.model.PortablePhone;
import bai_thi_module_2.repository.GenuinePhoneRepository;
import bai_thi_module_2.repository.PortablePhoneRepository;
import bai_thi_module_2.service.GenuinePhoneService;
import bai_thi_module_2.service.PortablePhoneService;

import java.util.List;
import java.util.Scanner;

public class PhoneView {
    Scanner scanner = new Scanner(System.in);
    private GenuinePhoneRepository genuinePhoneRepository = new GenuinePhoneRepository();
    private PortablePhoneRepository portablePhoneRepository = new PortablePhoneRepository();
    private GenuinePhoneController genuinePhoneController = new GenuinePhoneController();
    private PortablePhoneController portablePhoneController = new PortablePhoneController();

    public void displayMenu() {
        System.out.println("1. Add new phone");
        System.out.println("2. Delete phone");
        System.out.println("3. Search phone");
        System.out.println("4. Display all phones");
        System.out.println("0. Exit");
        System.out.println("Enter your choice: ");
        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1:
                addPhone();
                break;
            case 2:
                deletePhone();
                break;
            case 3:
                searchPhone();
                break;
            case 4:
                displayAllPhones();
                break;
            case 0:
                System.exit(0);
                break;
            default:
        }
    }

    private void addPhone() {
        System.out.println("Nhập thông tin cần thêm mới");

        System.out.println("Nhập loại điện thoại (Genuine/Portable): ");
        System.out.println("1. Genuine");
        System.out.println("2. Portable");

        int type = Integer.parseInt(scanner.nextLine());
        List<GenuinePhone> genuinePhoneList = genuinePhoneRepository.getAllGenuinePhones();
        List<PortablePhone> portablePhoneList = portablePhoneRepository.getAllPortablePhones();

        int id  = genuinePhoneList.size()+ portablePhoneList.size() + 1;

        System.out.println("nhập tên điện thoại: ");
        String name = scanner.nextLine();
        double price;
        int quantity;

        do{
            System.out.println("nhập giá điện thoại: ");
            price = Double.parseDouble(scanner.nextLine());
        }while (price <= 0);

        do {
            System.out.println("nhập số lượng điện thoại: ");
            quantity = Integer.parseInt(scanner.nextLine());
        }while (quantity <= 0);

        System.out.println("nhập nhà sản xuất: ");
        String manufacturer = scanner.nextLine();
        switch (type) {
            case 1:
                int warrantyPeriod;
                do {
                    System.out.println("nhập thời gian bảo haành(ngày): ");
                    warrantyPeriod = Integer.parseInt(scanner.nextLine());
                }while (warrantyPeriod <= 0||warrantyPeriod>730);

                System.out.println("np phạm vi bảo hành");
                String scope = scanner.nextLine();
                GenuinePhone genuinePhone = new GenuinePhone( id,name, price, quantity, manufacturer, warrantyPeriod, scope);
                genuinePhoneController.addGenuinePhone(genuinePhone);
                break;
            case 2:

                System.out.println("nhập quốc gia điện thoại: ");
                String country = scanner.nextLine();
                System.out.println("nhập trạng thái điện thoại (Sử dụng/Chưa sử dụng): ");
                String status = scanner.nextLine();
                PortablePhone portablePhone = new PortablePhone(id, name, price, quantity, manufacturer, country, status);
                portablePhoneController.addPortablePhone(portablePhone);
                break;
            default:
                System.out.println("Invalid type. Please choose again.");
                break;
        }
    }

    private void deletePhone() {
        System.out.println("nhập ID");
        int idDelete  = Integer.parseInt(scanner.nextLine());
        genuinePhoneController.deleteGenuinePhone(idDelete);
        portablePhoneController.deletePortablePhone(idDelete);
    }

    private void searchPhone() {
        System.out.println("nhập ID điện thoại cần tìm kiếm:  ");
        int idSearch = Integer.parseInt(scanner.nextLine());
        System.out.println(genuinePhoneController.findGenuinePhoneById(idSearch).toString());
        System.out.println(portablePhoneController.getPortablePhoneById(idSearch).toString());
    }

    private void displayAllPhones() {
        System.out.println("danh sách điện thoại:");
        genuinePhoneController.getAllGenuinePhones();
        portablePhoneController.getAllPortablePhones();
    }

    public void validateScope(String scope) {

    }

}

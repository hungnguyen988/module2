package bai_thi_module_2;

import bai_thi_module_2.view.PhoneView;

public class Main {
    private PhoneView phoneView = new PhoneView();
    public static void main(String[] args) {
        Main main = new Main();
        main.phoneView.displayMenu();
    }
}

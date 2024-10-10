package hoa_don_tien_dien.controller;

import hoa_don_tien_dien.model.Bill;
import hoa_don_tien_dien.service.BillService;
import hoa_don_tien_dien.validate.FindNotBillIIdException;

public class BillController {
    private BillService billService = new BillService()  ;


    public void addBill(Bill bill) {
        billService.addBill(bill);
    }

    public void displayBillList() {
        billService.displayBillList();
    }

    public void deleteBill(String idBill) throws FindNotBillIIdException {
        billService.deleteBill(idBill);
    }
}

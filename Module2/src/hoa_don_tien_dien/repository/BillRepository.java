package hoa_don_tien_dien.repository;

import hoa_don_tien_dien.model.Bill;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BillRepository {
    private static final String FILE_PATH = "E:\\codegym\\module2\\Module2\\src\\hoa_don_tien_dien\\data\\hoaDon.csv";
    List<Bill> bills;

    public BillRepository() {
        bills = new ArrayList<>();
    }

    public void addBill(Bill bill) {
        bills.add(bill);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            writer.write(bill.toString());
            writer.newLine();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Bill> getAllBills() {
        readBill();
        return bills;
    }

    public void readBill() {
        bills.clear();
        try(BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine())!= null) {
                if (line.isEmpty()) {
                    continue;
                }
                String[] data = line.split(",");
                Bill bill = new Bill(data[0], data[1], data[2], Double.parseDouble(data[3]), Double.parseDouble(data[4]), Double.parseDouble(data[5]));
                bills.add(bill);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void  writeBill(List<Bill> bills) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (Bill bill : bills) {
                writer.write(bill.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readBillByIdCustomer(String idCustomer) {
        bills.clear();
        try(BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine())!= null) {
                if (line.isEmpty()) {
                    continue;
                }
                String[] data = line.split(",");
                Bill bill = new Bill(data[0], data[1], data[2], Double.parseDouble(data[3]), Double.parseDouble(data[4]), Double.parseDouble(data[5]));

                if (bill.getIdCustomer().equals(idCustomer)) {
                    bills.add(bill);
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public void deleteBillById(String idBill) {
        readBill();
        bills.removeIf(bill -> bill.getIdBill().equals(idBill));
        writeBill(bills);
    }
}

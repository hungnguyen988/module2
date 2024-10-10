package hoa_don_tien_dien.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private  String idCustomer;
    private  String name;

    public Customer(String idCustomer, String name) {
        this.idCustomer = idCustomer;
        this.name = name;

    }
    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getName() {
        return name;
    }

    public void  setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return idCustomer + "," + name;
    }
}

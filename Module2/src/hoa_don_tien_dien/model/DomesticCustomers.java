package hoa_don_tien_dien.model;

public class DomesticCustomers extends Customer  {

    private String customerType;
    private double consumptioNorms;

    public DomesticCustomers(String idCustomer, String name, String customerType, double consumptioNorms) {
        super(idCustomer, name);
        this.customerType = customerType;
        this.consumptioNorms = consumptioNorms;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public double getConsumptioNorms() {
        return consumptioNorms;
    }

    public void setConsumptioNorms(double consumptioNorms) {
        this.consumptioNorms = consumptioNorms;
    }

    @Override
    public String toString() {
        return super.toString() + "," + customerType + "," + consumptioNorms;
    }
}

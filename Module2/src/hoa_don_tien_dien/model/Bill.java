package hoa_don_tien_dien.model;

public class Bill {

    private String idBill;
    private String idCustomer;
    private String date;
    private double quantity;
    private double pricePerUnit;
    private double totalPrice;

    public Bill(){}


    public Bill(String idBill, String idCustomer, String date, double quantity, double pricePerUnit, double totalPrice) {
        this.idBill = idBill;
        this.idCustomer = idCustomer;
        this.date = date;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
        this.totalPrice = totalPrice;
    }


    public String getIdBill() {
        return idBill;
    }

    public void setIdBill(String idBill) {
        this.idBill = idBill;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String toString() {
        return this.getIdBill() + "," + this.getIdCustomer() + "," + this.getDate() + "," + this.getPricePerUnit() + "," + this.getQuantity() + "," + this.getTotalPrice();
    }
}

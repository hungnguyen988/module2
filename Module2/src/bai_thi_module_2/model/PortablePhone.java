package bai_thi_module_2.model;

public class PortablePhone extends Phone{
    private String country;
    private String status;
    public PortablePhone(int id, String name, double price, int quantity, String manufacturer, String country, String status) {
        super(id, name, price, quantity, manufacturer);
        this.country = country;
        this.status = status;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public String toString() {
        return super.toString() + "," + country + "," + status;
    }
}

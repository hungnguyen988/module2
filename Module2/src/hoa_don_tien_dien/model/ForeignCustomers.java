package hoa_don_tien_dien.model;

public class ForeignCustomers extends Customer  {
    private String country;

    public ForeignCustomers(String idCustomer, String name, String country) {
        super(idCustomer, name);
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return super.toString() + "," + country;
    }
}

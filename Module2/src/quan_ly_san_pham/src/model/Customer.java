package quan_ly_san_pham.src.model;

public class Customer {
    public int id;
    public String name;
    public String address;
    public String numberPhone;

    public Customer() {
    }


    public Customer(int id, String name, String address, String numberPhone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.numberPhone = numberPhone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

}

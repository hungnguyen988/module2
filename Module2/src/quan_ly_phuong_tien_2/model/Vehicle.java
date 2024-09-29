package quan_ly_phuong_tien_2.model;

public class Vehicle {
    private String licensePlate;
    private String manufacturer;
    private int year;
    private String owner;

    public Vehicle(String licensePlate, String manufacturer, int year, String owner) {
        this.licensePlate = licensePlate;
        this.manufacturer = manufacturer;
        this.year = year;
        this.owner = owner;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}

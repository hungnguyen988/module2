package phuong_tien_doc_ghi_file.model;

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

    public String getManufacturer() {
        return manufacturer;
    }

    public int getYear() {
        return year;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return licensePlate + "," + manufacturer + "," + year + "," + owner;
    }
}

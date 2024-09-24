package quan_ly_phuong_tien_giao_thong.src.model;

public abstract class Vehicle {
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

    public abstract void displayInfo();
}


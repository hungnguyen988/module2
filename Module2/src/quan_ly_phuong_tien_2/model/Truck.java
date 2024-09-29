package quan_ly_phuong_tien_2.model;

public class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String licensePlate, String manufacturer, int year, String owner, double loadCapacity) {
        super(licensePlate, manufacturer, year, owner);
        this.loadCapacity = loadCapacity;
    }


    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public String toString() {
        return "Truck [License Plate=" + getLicensePlate() + ", Manufacturer=" + getManufacturer() + ", Year=" + getYear() + ", Owner=" + getOwner() + ", Load Capacity=" + loadCapacity + "]";
    }
}

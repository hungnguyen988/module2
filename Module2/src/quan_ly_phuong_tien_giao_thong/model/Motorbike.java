package quan_ly_phuong_tien_giao_thong.model;

public class Motorbike extends Vehicle {
    private double capacity;
    public Motorbike(String licensePlateNumber, String manufacturer, int yearOfManufacture, String owner, double capacity) {
        super(licensePlateNumber, manufacturer, yearOfManufacture, owner);
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }
}

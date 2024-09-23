package quan_ly_phuong_tien_giao_thong.model;

public class Truck extends Vehicle {
    private double payload;
    public Truck(String licensePlateNumber, String manufacturer, int yearOfManufacture, String owner, double payload) {
            super(licensePlateNumber, manufacturer, yearOfManufacture, owner);
            this.payload = payload;
    }

    public double getPayload() {
        return payload;
    }

    public void setPayload(double payload) {
        this.payload = payload;
    }
}

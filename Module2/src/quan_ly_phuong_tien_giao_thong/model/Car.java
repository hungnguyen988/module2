package quan_ly_phuong_tien_giao_thong.model;

public class Car extends Vehicle {
    private int numberOfSeats;
    private String vehicleType;
    public Car(String licensePlateNumber, String manufacturer, int yearOfManufacture, String owner,int numberOfSeats, String vehicleType) {
        super(licensePlateNumber, manufacturer, yearOfManufacture, owner);
        this.numberOfSeats = numberOfSeats;
        this.vehicleType = vehicleType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
}

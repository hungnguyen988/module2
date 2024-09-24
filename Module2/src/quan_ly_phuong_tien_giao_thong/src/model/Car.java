package quan_ly_phuong_tien_giao_thong.src.model;


public class Car extends Vehicle {
    private int seats;
    private String type; // Ví dụ: du lịch, xe khách

    public Car(String licensePlate, String manufacturer, int year, String owner, int seats, String type) {
        super(licensePlate, manufacturer, year, owner);
        this.seats = seats;
        this.type = type;
    }

    public int getSeats() {
        return seats;
    }

    public String getType() {
        return type;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car [License Plate: " + getLicensePlate() + ", Manufacturer: " + getManufacturer() +
                ", Year: " + getYear() + ", Owner: " + getOwner() + ", Seats: " + seats + ", Type: " + type + "]");
    }
}

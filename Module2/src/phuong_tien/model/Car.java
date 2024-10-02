package phuong_tien.model;

public class Car extends Vehicle  {
    private int seats;
    private String type;
    public Car(String licensePlate, String manufacturer, int year, String owner, int seats, String type) {
        super(licensePlate, manufacturer, year, owner);
        this.seats = seats;
        this.type = type;
    }
    public int getSeats() {
        return seats;
    }
    public void setSeats(int seats) {
        this.seats = seats;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                super.toString() +
                ", seats=" + seats +
                ", type='" + type + '\'' +
                '}';
    }
}

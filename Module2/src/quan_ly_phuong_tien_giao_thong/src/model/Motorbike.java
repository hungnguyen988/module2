package quan_ly_phuong_tien_giao_thong.src.model;

public class Motorbike extends Vehicle {
    private double power;

    public Motorbike(String licensePlate, String manufacturer, int year, String owner, double power) {
        super(licensePlate, manufacturer, year, owner);
        this.power = power;
    }

    public double getPower() {
        return power;
    }

    @Override
    public void displayInfo() {
        System.out.println("Motorbike [License Plate: " + getLicensePlate() + ", Manufacturer: " + getManufacturer() +
                ", Year: " + getYear() + ", Owner: " + getOwner() + ", Power: " + power + " HP]");
    }
}


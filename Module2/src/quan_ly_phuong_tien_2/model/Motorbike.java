package quan_ly_phuong_tien_2.model;

public class Motorbike extends Vehicle  {
    private double power;
    public Motorbike(String licensePlate, String manufacturer, int year, String owner, double power) {
        super(licensePlate, manufacturer, year, owner);
        this.power = power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public double getPower() {
        return power;
    }

    public String toString() {
        return "Motorbike [licensePlate=" + getLicensePlate() + ", manufacturer=" + getManufacturer() + ", year=" + getYear() + ", owner=" + getOwner() + ", power=" + power + "]";
    }

}

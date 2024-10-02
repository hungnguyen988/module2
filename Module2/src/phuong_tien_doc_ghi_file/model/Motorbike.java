package phuong_tien_doc_ghi_file.model;

public class Motorbike extends Vehicle  {
    private double power;
    public Motorbike(String licensePlate, String manufacturer, int year, String owner, double power) {
        super(licensePlate, manufacturer, year, owner);
        this.power = power;
    }
    public double getPower() {
        return power;
    }
    public void setPower(double power) {
        this.power = power;
    }
    @Override
    public String toString() {
        return  super.toString() + "," + power ;
    }
}

package phuong_tien_doc_ghi_file.model;

public class Truck extends Vehicle  {
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

    @Override
    public String toString() {
        return super.toString() + "," + loadCapacity;
    }

}

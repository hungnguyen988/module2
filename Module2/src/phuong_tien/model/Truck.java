package phuong_tien.model;

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
        return "Truck{" +
                super.toString() +
                ", loadCapacity=" + loadCapacity +
                '}';
    }
}

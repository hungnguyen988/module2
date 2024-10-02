package ss17.bai_tap.luu_file_nhi_phan;

import java.io.Serializable;

public class Product implements Serializable {
    private final String id;
    private final String name;
    private final double price;
    private final String manufacturer;
    private final String description;

    public Product(String id, String name, double price, String manufacturer, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.manufacturer = manufacturer;
        this.description = description;
    }

    // Getter và Setter
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + ", manufacturer=" + manufacturer
                + ", description=" + description + "]";
    }
}

package doc_ghi_file_phuong_tien.repository;

import phuong_tien_doc_ghi_file.model.Manufacturer;

import java.util.ArrayList;
import java.util.List;

public class ManufacturerRepository {
    private List<Manufacturer> manufacturerList = new ArrayList<>();
    {
        manufacturerList.add(new Manufacturer(1, "Toyota", "Japan"));
        manufacturerList.add(new Manufacturer(2, "Honda", "Japan"));
        manufacturerList.add(new Manufacturer(3, "Ford", "USA"));
        manufacturerList.add(new Manufacturer(4, "BMW", "Germany"));
        manufacturerList.add(new Manufacturer(5, "Mercedes", "Germany"));
    }
    public void getAllManufacturers() {
        for (int i = 0; i < manufacturerList.size(); i++) {
            System.out.println((i+1) + ". " + manufacturerList.get(i).getName());
        }
    }
    public void addManufacturer(Manufacturer manufacturer) {
        manufacturerList.add(manufacturer);
    }
}

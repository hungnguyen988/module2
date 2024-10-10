package bai_thi_module_2.service;

import bai_thi_module_2.model.GenuinePhone;
import bai_thi_module_2.repository.GenuinePhoneRepository;

import javax.swing.plaf.PanelUI;

public class GenuinePhoneService implements IGenuinePhoneService  {
    private GenuinePhoneRepository repository;
    public GenuinePhoneService() {
        this.repository = new GenuinePhoneRepository();
    }


    public void addGenuinePhone(GenuinePhone phone) {
        repository.addGenuinePhone(phone);
        System.out.println("Genuine phone added successfully!");
    }

    public void deleteGenuinePhone(int id) {
        repository.deletePhone(id);
        System.out.println("Genuine phone deleted successfully!");
    }

    public void getAllGenuinePhones() {
        System.out.println("List of genuine phones:");
        for (GenuinePhone phone : repository.getAllGenuinePhones()) {
            System.out.println(phone);
        }
    }

    public GenuinePhone findGenuinePhoneById(int id) {
        return repository.findById(id);
    }
}

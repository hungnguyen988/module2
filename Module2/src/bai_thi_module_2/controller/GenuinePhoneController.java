package bai_thi_module_2.controller;

import bai_thi_module_2.model.GenuinePhone;
import bai_thi_module_2.service.GenuinePhoneService;

public class GenuinePhoneController {
    private GenuinePhoneService genuinePhoneService;

    public GenuinePhoneController() {
        this.genuinePhoneService = new GenuinePhoneService();
    }


    public void addGenuinePhone(GenuinePhone phone) {
        genuinePhoneService.addGenuinePhone(phone);
    }


    public void deleteGenuinePhone(int id) {
        genuinePhoneService.deleteGenuinePhone(id);
    }

    public void getAllGenuinePhones() {
        genuinePhoneService.getAllGenuinePhones();
    }

    public GenuinePhone findGenuinePhoneById(int id) {
        return genuinePhoneService.findGenuinePhoneById(id);
    }
}

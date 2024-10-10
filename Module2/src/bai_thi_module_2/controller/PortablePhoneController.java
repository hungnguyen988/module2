package bai_thi_module_2.controller;

import bai_thi_module_2.model.PortablePhone;
import bai_thi_module_2.service.PortablePhoneService;

public class PortablePhoneController {
    private PortablePhoneService portablePhoneService;

    public PortablePhoneController() {
    this.portablePhoneService = new PortablePhoneService();
    }


    public void addPortablePhone(PortablePhone portablePhone) {

        portablePhoneService.addPortablePhone(portablePhone);
    }

    public void deletePortablePhone(int id) {
        portablePhoneService.deletePhone(id);
    }

    public void getAllPortablePhones() {
        portablePhoneService.getAllPortablePhones();
    }

    public PortablePhone getPortablePhoneById(int id) {
        return portablePhoneService.findPhoneById(id);
    }
}

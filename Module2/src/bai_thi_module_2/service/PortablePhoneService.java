package bai_thi_module_2.service;

import bai_thi_module_2.model.PortablePhone;
import bai_thi_module_2.repository.PortablePhoneRepository;

import java.util.List;

public class PortablePhoneService implements  IPortablePhoneService {
    private PortablePhoneRepository portablePhoneRepository;

    public PortablePhoneService() {
        this.portablePhoneRepository = new PortablePhoneRepository();
    }


    public void addPortablePhone(PortablePhone portablePhone) {
        portablePhoneRepository.addPortablePhone(portablePhone);
        System.out.println("điện thoapij đưpjc thêm thành công");
    }

    public void deletePhone(int id) {
        portablePhoneRepository.deletePhone(id);
        System.out.println("điện thoại có id: " + id + " đã xóa thành công");
    }

    public void getAllPortablePhones() {
        List<PortablePhone> portablePhones = portablePhoneRepository.getAllPortablePhones();
        for (PortablePhone portablePhone : portablePhones) {
            System.out.println(portablePhone);
        }
    }

    public PortablePhone findPhoneById(int id) {
        return portablePhoneRepository.findPhoneById(id);
    }
}

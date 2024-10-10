package bai_thi_module_2.service;

import bai_thi_module_2.model.PortablePhone;

public interface IPortablePhoneService {
    void addPortablePhone(PortablePhone portablePhone);
    void deletePhone(int id);
    void getAllPortablePhones();
    PortablePhone findPhoneById(int id);
}

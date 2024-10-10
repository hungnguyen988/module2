package bai_thi_module_2.service;

import bai_thi_module_2.model.GenuinePhone;

public interface IGenuinePhoneService {
    void  addGenuinePhone(GenuinePhone phone);
    void deleteGenuinePhone(int id);
    void getAllGenuinePhones();
    GenuinePhone findGenuinePhoneById(int id);
}

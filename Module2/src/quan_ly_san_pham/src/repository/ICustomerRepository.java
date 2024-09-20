package quan_ly_san_pham.src.repository;

import quan_ly_san_pham.src.model.Customer;

import java.util.List;

public interface ICustomerRepository {
    public List<Customer> findAll();
    public Customer findById(int id);
    public Customer findByName(String name);
    public void add(Customer customer);
    public void update(Customer customer);
    public void delete(int id);
    public void sortAfterDeletion(int id);

}

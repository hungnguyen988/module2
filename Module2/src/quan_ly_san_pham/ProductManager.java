package quan_ly_san_pham;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ProductManager {
  List<Product> products= new LinkedList<Product>();
    {
        products.add(new Product(1,"a",12));
        products.add(new Product(2,"b",13));
        products.add(new Product(3,"c",10));
    }


    //thêm sản phẩm
    public void addProduct(Product product) {
        products.add(product);
    }

    //tìm sản phẩm theo id
    public Product getProducts(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }


    //sửa thông tin theo id
    public void updateProduct(int id, String name, double price) {
        for (Product product : products) {
            if (product.getId() == id) {
                product.setName(name);
                product.setPrice(price);
            }
        }
        System.out.println("đã cập nhật thành công");
    }

    //xóa sản phẩm
    public void deleteProduct(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                products.remove(product);
            }
        }
        System.out.println("đã xóa thành công");
    }


    //hiển thị danh sách sản phẩm
    public void displayProductsList() {
        for (Product product : products) {
            System.out.println(product);
            System.out.println("------------------------");
        }
    }

    //tìm kiếm sản phẩm theo tên
    public void displayProducts(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                System.out.println(product);
            }
        }
    }

    //sắp xếp sản phẩm tăng dần
    public void sortProducts() {
        Collections.sort(products);
        System.out.println("danh sách đã đươợc sắp xếp");
    }

}

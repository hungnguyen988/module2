package ss17.bai_tap.luu_file_nhi_phan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    // Ghi thông tin sản phẩm vào file nhị phân
    public void writeProductToFile(Product product, String filename) {
        try (FileOutputStream fos = new FileOutputStream(filename, true);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(product);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Đọc thông tin sản phẩm từ file nhị phân
    public List<Product> readProductsFromFile(String filename) {
        List<Product> productList = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(filename);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            while (true) {
                try {
                    Product product = (Product) ois.readObject();
                    productList.add(product);
                } catch (EOFException e) {
                    break; // Kết thúc file
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return productList;
    }

    // Tìm kiếm sản phẩm theo mã sản phẩm
    public Product findProductById(String productId, String filename) {
        List<Product> products = readProductsFromFile(filename);
        for (Product product : products) {
            if (product.getId().equals(productId)) {
                return product;
            }
        }
        return null;
    }
}

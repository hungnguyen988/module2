package ss16.file_csv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountryReader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập đường dẫn đến file CSV (đường dẫn tuyệt đối): ");
        String csvFile = scanner.nextLine();  // Tên file CSV
        String line ;
        String csvSplitBy = ",";

        // Danh sách để lưu trữ các quốc gia
        List<Country> countries = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                // Tách các giá trị trong dòng dựa trên dấu phẩy
                String[] countryData = line.split(csvSplitBy);

                // Xóa dấu ngoặc kép xung quanh mã quốc gia và tên quốc gia
                String id = countryData[0];
                String code = countryData[1].replace("\"", "");
                String name = countryData[2].replace("\"", "");

                // Tạo đối tượng Country và thêm vào danh sách
                Country country = new Country(Integer.parseInt(id), code, name);
                countries.add(country);
            }
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi đọc tệp: " + e.getMessage());
        }

        // Hiển thị danh sách các quốc gia
        System.out.println("Danh sách các quốc gia:");
        for (Country country : countries) {
            System.out.println(country);
        }
    }
}

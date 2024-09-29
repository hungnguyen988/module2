package ss16.file_csv;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CreateCSV {
    public static void main(String[] args) {
        String csvFile = "countries.csv"; // Tên file CSV
        String[] header = {"id", "code", "name"};
        String[][] data = {
                {"1", "AU", "Australia"},
                {"2", "CN", "China"},
                {"3", "JP", "Japan"},
                {"4", "TH", "Thailand"}
        };

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFile))) {
            // Ghi tiêu đề
            bw.write(String.join(",", header));
            bw.newLine();

            // Ghi dữ liệu
            for (String[] row : data) {
                bw.write(String.join(",", row));
                bw.newLine();
            }
            System.out.println("Tệp CSV đã được tạo thành công!");
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi tạo tệp: " + e.getMessage());
        }
    }
}


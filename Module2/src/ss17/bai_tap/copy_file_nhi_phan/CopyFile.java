package ss17.bai_tap.copy_file_nhi_phan;

import java.io.*;
import java.util.Scanner;

public class CopyFile {

    // Phương thức sao chép tệp
    public static void copyFile(String sourceFile, String targetFile) {
        File source = new File(sourceFile);
        File target = new File(targetFile);

        // Kiểm tra xem tệp nguồn có tồn tại hay không
        if (!source.exists()) {
            System.out.println("Tệp nguồn không tồn tại: " + sourceFile);
            return;
        }

        // Kiểm tra nếu tệp đích đã tồn tại
        if (target.exists()) {
            System.out.println("Cảnh báo: Tệp đích đã tồn tại: " + targetFile);
            System.out.print("Bạn có muốn ghi đè không? (y/n): ");
            Scanner scanner = new Scanner(System.in);
            String choice = scanner.nextLine();
            if (!choice.equalsIgnoreCase("y")) {
                System.out.println("Hủy bỏ sao chép tệp.");
                return;
            }
        }

        // Tiến hành sao chép tệp
        try (FileInputStream fis = new FileInputStream(source);
             DataInputStream dis = new DataInputStream(fis);
             FileOutputStream fos = new FileOutputStream(target);
             DataOutputStream dos = new DataOutputStream(fos)) {

            byte[] buffer = new byte[1024];  // Bộ đệm 1 KB
            int bytesRead;
            long totalBytes = 0;

            // Đọc từng khối byte từ tệp nguồn và ghi vào tệp đích
            while ((bytesRead = dis.read(buffer)) != -1) {
                dos.write(buffer, 0, bytesRead);
                totalBytes += bytesRead; // Cập nhật tổng số byte đã sao chép
            }
            dos.flush();  // Xóa bộ đệm và ghi vào tệp đích


            System.out.println("Sao chép hoàn thành. Tổng số byte đã sao chép: " + totalBytes);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Yêu cầu người dùng nhập tệp nguồn và tệp đích
        System.out.print("Nhập đường dẫn tệp nguồn: ");
        String sourceFile = scanner.nextLine();

        System.out.print("Nhập đường dẫn tệp đích: ");
        String targetFile = scanner.nextLine();

        // Gọi phương thức sao chép
        copyFile(sourceFile, targetFile);
    }
}


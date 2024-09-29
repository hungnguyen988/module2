package ss16.copy_file;

import java.io.*;


public class CopyFileText {

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Nhập đường dẫn tập tin nguồn: ");
            String sourcePath = reader.readLine();
            System.out.print("Nhập đường dẫn tập tin đích: ");
            String targetPath = reader.readLine();

            File sourceFile = new File(sourcePath);
            File targetFile = new File(targetPath);

            // Kiểm tra nếu tập tin nguồn không tồn tại
            if (!sourceFile.exists()) {
                System.out.println("Tập tin nguồn không tồn tại.");
                return;
            }

            // Kiểm tra nếu tập tin đích đã tồn tại
            if (targetFile.exists()) {
                System.out.println("Tập tin đích đã tồn tại.");
                return;
            }

            // Sử dụng FileReader để đếm ký tự thay vì byte
            FileReader fileReader = new FileReader(sourceFile);
            FileWriter fileWriter = new FileWriter(targetFile);

            int charCount = 0;
            int charRead;
            while ((charRead = fileReader.read()) != -1) {
                fileWriter.write(charRead);
                charCount++;
            }

            // Đóng luồng
            fileReader.close();
            fileWriter.close();

            System.out.println("Đã sao chép thành công " + charCount + " ký tự.");

        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi: " + e.getMessage());
        }
    }
}


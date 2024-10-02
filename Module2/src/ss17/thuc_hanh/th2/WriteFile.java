package ss17.thuc_hanh.th2;

import java.io.*;

public class WriteFile {
    public static void main(String[] args) {
        writeFile();
        readFile();
    }

    private static void writeFile() {
        File file = new File("E:\\codegym\\module2\\Module2\\src\\ss17\\thuc_hanh\\th2\\data.bin");
        try(
            FileOutputStream fileOutputStream = new FileOutputStream("E:\\codegym\\module2\\Module2\\src\\ss17\\thuc_hanh\\th2\\data.bin");
            DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream)){
            dataOutputStream.writeInt(25);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void readFile(){
        try(
            FileInputStream fileInputStream = new FileInputStream("E:\\codegym\\module2\\Module2\\src\\ss17\\thuc_hanh\\th2\\data.bin");
            DataInputStream dataInputStream = new DataInputStream(fileInputStream)){

            int number = dataInputStream.readInt();
            System.out.println("Number: " + number);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

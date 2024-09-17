package ss5.thuc_hanh;

public class Run {
    public static void main(String[] args) {
        Student s1 = new Student(1, "phuong");
        Student s2 = new Student(2, "minh");
        Student.school = "CG2";
        System.out.println(s1);
        System.out.println(s2);
    }
}

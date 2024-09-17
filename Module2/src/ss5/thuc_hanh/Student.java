package ss5.thuc_hanh;

public class Student {
    public String name;
    public int id;
    public static String school = "CG";
    public Student( int id , String name) {
        this.name = name;
        this.id = id;


    }
    public String toString() {
        return "Student [name=" + name + ", id=" + id + ", school=" + school + "]";
    }

}

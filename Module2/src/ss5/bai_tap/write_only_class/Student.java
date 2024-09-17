package ss5.bai_tap.write_only_class;

public class Student {
    private String name = "John";
    private String classes = "C02";

    Student() {
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setClasses(String classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

}

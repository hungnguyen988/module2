package ss10.bai_tap.bai_1;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.add("hung");
        list.add("luu");
        list.add("pphuong");
        list.add(null);
        list.add(2,"dong");
        list.toStringList();
        System.out.println(list.size());
        System.out.println(list.clone());
        System.out.println(list.get(1));
        System.out.println(list.contains("minh"));
        System.out.println(list.contains("Luu"));
        System.out.println(list.contains("luu"));
        System.out.println(list.indexOf("minh"));
        System.out.println(list.indexOf("luu"));
        System.out.println(list.indexOf(null));
    }
}

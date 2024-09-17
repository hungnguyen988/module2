package ss7.bai_tap.bai_2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

interface Colorable{
    void howToColor(
    );
}

public class ShapeTest2 {
    public static void main(String[] args) {
        Shape shape[] = new Shape[3];
        shape[0] = new Rectangle(3,4,"red",true);
        shape[1] = new Square(5,"black",false);
        shape[2] = new Square(1,"white",false);


        for (Shape s : shape) {
            System.out.println(s);
            if (s instanceof Colorable){
                ((Colorable) s).howToColor();
                System.out.println(s.getArea());

            }
        }

        Arrays.sort(shape);
        System.out.println("sau khi sắp xếp:");
        for (Shape s : shape) {
            System.out.println(s);
        }
    }
}

package ss10.bai_tap.bai_1;

import java.util.Arrays;

public class MyList<E> {
     private int size = 0;
     private static final int DEFAULT_CAPACITY = 10;
     private Object elements[];

     // Khởi tạo danh sách với dung lượng mặc định
     public MyList() {
          elements = new Object[DEFAULT_CAPACITY];
     }

     // Khởi tạo danh sách với dung lượng xác định bởi tham số capacity
     public MyList(int capacity) {
          if (capacity > 0) {
               elements = new Object[capacity];
          } else {
               elements = new Object[DEFAULT_CAPACITY];
          }
     }

     // Thêm phần tử vào vị trí index
     public void add(int index, E element) {
          if (index < 0 || index > size) {
               System.out.println("vui lòng nhập đúng vị trí cần thêm");
          }else {
               ensureCapacity(size + 1);
               for (int i = size; i > index; i--) {
                    elements[i] = elements[i - 1];
               }
               elements[index] = element;
               size++;
          }
     }

     // Xóa phần tử tại vị trí index
     public E remove(int index) {
          if (index < 0 || index >= size) {
               return null;
          }
          E oldValue = (E) elements[index];

          for (int i = index; i < size - 1; i++) {
               elements[i] = elements[i + 1];
          }
          elements[--size] = null;
          return oldValue;
     }

     // Trả về số lượng phần tử trong danh sách
     public int size() {
          return size;
     }

     // Trả về bản sao của danh sách
     public MyList<E> clone() {
          MyList<E> clone = new MyList<>(elements.length);
          clone.size = size;
          clone.elements = Arrays.copyOf(elements, size);
          return clone;
     }



     // Trả về phần tử tại vị trí i
     public E get(int i) {
          if (i >= size || i < 0) {
               return null;
          }
          return (E) elements[i];
     }

     // Kiểm tra danh sách có chứa phần tử o không
     public boolean contains(E o) {
          return indexOf(o) >= 0;
     }

     // Trả về chỉ số của phần tử đầu tiên bằng o
     public int indexOf(E o) {
          if (o == null) {
               for (int i = 0; i < size; i++)
                    if (elements[i] == null)
                         return i;
          } else {
               for (int i = 0; i < size; i++)
                    if (o.equals(elements[i]))
                         return i;
          }
          return -1;
     }

     // Thêm vào cuối danh sách
     public boolean add(E e) {
          ensureCapacity(size + 1);
          elements[size++] = e;
          return true;
     }

     // Đảm bảo dung lượng của danh sách ít nhất bằng minCapacity
     public void ensureCapacity(int minCapacity) {
          if (minCapacity > elements.length) {
               elements = Arrays.copyOf(elements, minCapacity);
          }
     }

     // Xóa tất cả các phần tử trong danh sách
     public void clear() {
          for (int i = 0; i < size; i++) {
               elements[i] = null;
          }
          size = 0;
     }

     // Phương thức hiển thị danh sách
     public void toStringList() {
          if (size == 0) {
               System.out.println("danh sách rỗng");
          }else {
               for (int i = 0; i < size; i++) {
                    System.out.println("Index " + (i + 1) + " : " + elements[i]);
               }

          }
     }
}

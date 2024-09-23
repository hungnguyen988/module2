package ss11.bai_tap.queue;

public class QueueStructure {
    // Lớp Node biểu diễn một nút trong danh sách liên kết
    static class Node {
        int data; // Dữ liệu của nút
        Node link; // Liên kết đến nút tiếp theo

        // Constructor
        public Node(int data) {
            this.data = data;
            this.link = null;
        }
    }

    // Lớp Queue biểu diễn hàng đợi liên kết vòng
    static class Queue {
        Node front; // Nút đầu hàng đợi
        Node rear; // Nút cuối hàng đợi

        // Constructor
        public Queue() {
            this.front = null;
            this.rear = null;
        }
    }

    // Lớp Solution chứa các phương thức xử lý hàng đợi
     static class Solution {
        Queue queue;

        // Constructor
        public Solution() {
            queue = new Queue();
        }

        // Phương thức thêm phần tử vào hàng đợi
        public void enQueue(int data) {
            Node newNode = new Node(data); // B1: Tạo node mới, thêm giá trị vào node

            if (queue.front == null) { // B2: Kiểm tra hàng đợi trống
                queue.front = newNode;
                queue.rear = newNode;
                newNode.link = newNode; // Liên kết vòng
            } else {
                queue.rear.link = newNode; // Nối rear hiện tại với node mới
                newNode.link = queue.front; // Node mới trỏ đến front
                queue.rear = newNode; // Cập nhật rear mới
            }
        }

        // Phương thức lấy phần tử ra khỏi hàng đợi
        public void deQueue() {
            if (queue.front == null) { // B1: Kiểm tra hàng đợi trống
                System.out.println("Queue is empty");
                return;
            }

            if (queue.front == queue.rear) { // B3: Kiểm tra Front == Rear
                queue.front = null;
                queue.rear = null;
            } else {
                queue.front = queue.front.link; // Cập nhật front mới
                queue.rear.link = queue.front; // Rear trỏ đến front mới
            }
        }

        // Phương thức hiển thị hàng đợi
        public void displayQueue() {
            if (queue.front == null) {
                System.out.println("Queue is empty");
                return;
            }

            Node temp = queue.front;
            System.out.print("Queue: ");
            do {
                System.out.print(temp.data + " ");
                temp = temp.link;
            } while (temp != queue.front);
            System.out.println();
        }

        // Chương trình chính để kiểm tra
        public static void main(String[] args) {
            Solution solution = new Solution();

            solution.enQueue(10);
            solution.enQueue(20);
            solution.enQueue(30);
            solution.enQueue(40);

            solution.displayQueue(); // Queue: 10 20 30 40

            solution.deQueue();
            solution.displayQueue(); // Queue: 20 30 40

            solution.deQueue();
            solution.displayQueue(); // Queue: 30 40

            solution.enQueue(50);
            solution.displayQueue(); // Queue: 30 40 50
        }
    }

}

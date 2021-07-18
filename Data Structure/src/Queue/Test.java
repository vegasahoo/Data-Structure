package Queue;

public class Test {
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.enQueue(1);
        q.enQueue(2);
        q.enQueue(3);
        q.enQueue(4);
        q.enQueue(5);
        q.enQueue(6);
        q.deQueue();
        q.print();
        System.out.println("Front "+ q.getFront());
        System.out.println("Rear "+ q.getRear());
        System.out.println("Size "+ q.size);
    }
}

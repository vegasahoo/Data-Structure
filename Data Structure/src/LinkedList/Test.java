package LinkedList;

public class Test {

    public static void main(String[] args) {

        SingleLinkedList sll = new SingleLinkedList();
        sll.printList();
        sll.insertAtBegin(new ListNode(1));
        sll.insertAtEnd(new ListNode(2));
        sll.insertAtEnd(new ListNode(3));
        sll.insertAtEnd(new ListNode(4));
        sll.insertAtEnd(new ListNode(5));
        /*sll.removeFromBegin();
        sll.printList();
        sll.insertAtPosition(10,new ListNode(6));
        sll.removeFromBegin();
        sll.removeFromEnd();
        sll.removeFromPosition(3);
        sll.printList();
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.insertAtBegin(new DLListNode(1));
        dll.insertAtEnd(new DLListNode(2));
        dll.insertAtEnd(new DLListNode(3));
        dll.insertAtEnd(new DLListNode(4));
        dll.insertAtEnd(new DLListNode(5));
        dll.insertAtPosition(2,new DLListNode(6));
        dll.removeFromBegin();
        dll.removeFromEnd();
        dll.removeFromPosition(8);
        dll.printList();
        CircularLinkedList cll = new CircularLinkedList();
        cll.insertAtBegin(new ListNode(4));
        cll.insertAtBegin(new ListNode(3));
        cll.insertAtBegin(new ListNode(2));
        cll.insertAtBegin(new ListNode(1));
        cll.insertAtEnd(new ListNode(5));
        cll.insertAtEnd(new ListNode(6));
        System.out.println(cll.getNodeAtPosition(0).data);
        cll.removeFromBegin();
        cll.removeFromBegin();
        cll.removeFromEnd();
        cll.removeFromEnd();
        cll.removeFromPosition(7);
        cll.printList();*/
        sll.printList();
    }
}

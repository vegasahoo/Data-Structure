package LinkedList;

public class ReverseLinkedList {
    public static void reverseList(SingleLinkedList ll){
        ListNode curr = ll.getHead();
        ListNode temp = null;
        ListNode prev = null;
        while(curr!=null){
            temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        ll.head = prev;
    }

    public static void main(String[] args) {
        SingleLinkedList ll = new SingleLinkedList();
        ll.insertAtEnd(new ListNode(1));
        ll.insertAtEnd(new ListNode(2));
        ll.insertAtEnd(new ListNode(3));
        ll.insertAtEnd(new ListNode(4));
        ll.insertAtEnd(new ListNode(5));
        ReverseLinkedList.reverseList(ll);
        ll.printList();
    }
}

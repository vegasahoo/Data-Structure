package LinkedList;

public class CircularLinkedList {

    public ListNode head;
    private int length = 0;

    public synchronized ListNode getHead(){
        return head;
    }

    public void printList(){
        ListNode temp = head;
        do{
            System.out.println(temp.data);
            temp = temp.next;
        }
        while(temp!= head);
    }

    public synchronized void insertAtBegin(ListNode node){
        if(head == null){
            head = node;
            node.next = head;
            length++;
        }
        else{
            ListNode temp = head;
            while(temp.next != head){
                temp = temp.next;
            }
            node.next = head;
            temp.next = node;
            head = node;
            length++;
        }
    }

    public synchronized void insertAtEnd(ListNode node){
        if(head == null){
            insertAtBegin(node);
        }
        else{
            ListNode temp = head;
            while(temp.next != head){
                temp = temp.next;
            }
            temp.next = node;
            node.next = head;
            length++;
        }
    }

    public int getLength(){
        return length;
    }

    public ListNode getNodeAtPosition(int position){
        if(position < 0 || position >length){
            System.out.println("No node available at this position");
            return null;
        }
        ListNode temp = head;
        int count = 0;
        while(count!= position){
            temp = temp.next;
            count ++;
        }
        return temp;
    }
    public void insertAtPosition(int position, ListNode node){

        if(position == 0){
            insertAtBegin(node);
            return;
        }
        if(position == length){
            insertAtEnd(node);
            return;
        }
        ListNode temp = getNodeAtPosition(position);
        if(temp != null) {
            node.next = temp.next;
            temp.next = node;
        }
        else{
            System.out.println("No node available at the mentioned position");
        }
        length++;
    }

    public ListNode removeFromBegin() {
        if (length == 0) {
            return null;
        }

        ListNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        ListNode temp2 = head;
        head = head.next;
        temp.next = head;
        length--;
        return temp2;
    }
    public ListNode removeFromEnd(){
        if(length == 1){
            return removeFromBegin();
        }
        ListNode temp = head;
        while(temp.next.next != head){
            temp = temp.next;
        }
        ListNode temp2 = temp.next;
        temp.next = head;
        length--;
        return temp2;
    }
    public ListNode removeFromPosition(int position){
        if(position == 1){
            return removeFromBegin();
        }
        if(position == length){
            return removeFromEnd();
        }
        ListNode temp = getNodeAtPosition(position-1);
        if(temp != null) {
            temp.next = temp.next.next;
            length--;
            return temp;
        }
        else{
            System.out.println("No node available at the mentioned position");
            return null;
        }
    }
}

package LinkedList;

public class SingleLinkedList {

    public ListNode head;
    public int length = 0;

    public synchronized ListNode getHead(){
        return head;
    }
    public synchronized void insertAtBegin(ListNode node){
        node.next = head;
        head = node;
        length++;
    }
    public synchronized void insertAtEnd(ListNode node){
        if(head == null){
            head = node;
            length++;
            return;
        }
        ListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
        node.next = null;
        length++;
    }
    public void printList(){
        ListNode temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public int getLength(){
        return length;
    }
    public ListNode getNodeAtPosition(int position){
        if(position < 0 || position >length){
            return null;
        }
        ListNode temp = head;
        int count = 1;
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
    public ListNode removeFromBegin(){
        if(length == 0){
            return null;
        }
        ListNode temp = head;
        head = temp.next;
        temp.next = null;
        length--;
        return temp;
    }
    public ListNode removeFromEnd(){
        if(length == 1){
            removeFromBegin();
            return head;
        }
        ListNode temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        ListNode temp2 = temp.next;
        temp.next = null;
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

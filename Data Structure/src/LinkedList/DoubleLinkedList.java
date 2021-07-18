package LinkedList;

public class DoubleLinkedList {
    private int length;
    private DLListNode head;

    public synchronized DLListNode getHead(){
        return head;
    }

    public synchronized void insertAtBegin(DLListNode node){
        if(head == null){
            head = node;
            length++;
            return;
        }
        node.next = head;
        head.prev = node;
        head = node;
        length++;
    }

    public void printList(){
        DLListNode temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public int getLength(){
        return length;
    }

    public synchronized void insertAtEnd(DLListNode node){
        if(head == null){
            head = node;
            length++;
            return;
        }
        DLListNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;
        length++;
    }

    public DLListNode getNodeAtPosition(int position){
        if(position < 0 || position >length){
            return null;
        }
        DLListNode temp = head;
        int count = 1;
        while(count!= position){
            temp = temp.next;
            count ++;
        }
        return temp;
    }

    public void insertAtPosition(int position, DLListNode node){

        if(position == 0){
            insertAtBegin(node);
            return;
        }
        if(position == length){
            insertAtEnd(node);
            return;
        }
        DLListNode temp = getNodeAtPosition(position);
        if(temp != null) {
            node.next = temp.next;
            node.prev = temp;
            node.next.prev = node;
            temp.next = node;
        }
        else{
            System.out.println("No node available at the mentioned position");
        }
        length++;
    }

    public DLListNode removeFromBegin(){
        if(length == 0){
            return null;
        }
        DLListNode temp = head;
        head = temp.next;
        temp.next = null;
        head.prev = null;
        length--;
        return temp;
    }
    public DLListNode removeFromEnd(){
        if(length == 1){
            removeFromBegin();
            return head;
        }
        DLListNode temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        DLListNode temp2 = temp.next;
        temp.next.prev = null;
        temp.next = null;
        length--;
        return temp2;
    }
    public DLListNode removeFromPosition(int position){
        if(position == 1){
            return removeFromBegin();
        }
        if(position == length){
            return removeFromEnd();
        }
        DLListNode temp = getNodeAtPosition(position);
        if(temp != null) {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
            DLListNode temp2 = temp;
            temp =null;
            length--;
            return temp2;
        }
        else{
            System.out.println("No node available at the mentioned position");
            return null;
        }
    }
}

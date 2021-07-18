package Queue;

import LinkedList.ListNode;

public class Queue {
    int size, capacity;
    ListNode front, rear;

    Queue(int capacity){
        this.capacity = capacity;
        size =0;
        front  = rear = null;
    }
    boolean isEmpty(){
        return (size==0);
    }

    boolean isFull(){
       return (size==capacity);
    }

    int getFront(){
        return front.data;
    }
    int getRear(){
        return rear.data;
    }
    void print(){
        ListNode temp = front;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    void enQueue(int num){
        ListNode data = new ListNode(num);
        if(isEmpty()){
            front = rear = data;
            size++;
        }
        else if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        else{
            rear.next = data;
            rear = data;
            size++;
        }
    }
    int deQueue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return 0;
        }
        int data = front.data;
        front = front.next;
        size--;
        return data;
    }

}

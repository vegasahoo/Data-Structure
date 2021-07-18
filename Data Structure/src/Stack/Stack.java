package Stack;

public class Stack {

    int top;
    int size;
    int capacity;
    int[] stackRep;

    public Stack(int capacity){
        top = -1;
        size =0;
        this.capacity = capacity;
        stackRep = new int[capacity];
    }
    public boolean isEmpty(){
        return (top<0);
    }
    boolean isFull(){
        return (size==capacity);
    }

    public void push(int data){
        if(!(isFull())){
            stackRep[++top] = data;
            size++;
            return;
        }
        System.out.println("Stack is full");
    }
    public int pop(){
        if(!(isEmpty())){
            int data = stackRep[top];
            stackRep[top--]= Integer.MIN_VALUE;
            size--;
            return data;
        }
        System.out.println("Stack is empty");
        return -1;
    }
    public int getTop(){
        return stackRep[top];
    }
    public int getSize(){
        return size;
    }
    void print(){
        for(int i = top; i>-1;i--){
            System.out.println(stackRep[i]);
        }
    }
}

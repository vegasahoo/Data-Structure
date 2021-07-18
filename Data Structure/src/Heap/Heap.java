package Heap;

public class Heap {
    public  int[] array;
    public int count;
    public int capacity;
    public int heap_type;

    public Heap(int capacity){
        this.capacity = capacity;
        this.count = 0;
        this.array = new int[capacity];
    }

    public int getParent(int i){
        if(i<=0 || i>this.count){
            return -1;
        }
        return (i-1)/2;
    }
    public int getLeftChild(int i){
        int left = 2*i+1;
        if(left>=this.count){
            return -1;
        }
        return left;
    }

    public int getRightChild(int i){
        int right = 2*i+2;
        if(right>=this.count){
            return -1;
        }
        return right;
    }

    public int getMaximum(){
        if(this.count == 0){
            return 0;
        }
        return this.array[0];
    }

    public void print(){
        for (int i = 0; i < this.array.length; i++) {
            System.out.println(this.array[i]);

        }
    }

    public void percolateDown(int i){
        int left, right, temp, max;
        left = getLeftChild(i);
        right = getRightChild(i);
        max = (left!=-1 && this.array[left]>this.array[i])?left:i;
        max = (right!=-1 && this.array[right]>this.array[max])?right:max;
        if(max!=i){
            temp = this.array[max];
            this.array[max] = this.array[i];
            this.array[i]=temp;
            percolateDown(max);
        }
    }
    
    public void heapify() {
    	for(int i = this.array.length/2-1 ; i>=0;i--) {
    		percolateDown(i);
    	}
    }

    public static void main(String[] args) {
        int[] array = {1,4,3,2,6,7,9,5,0};
        Heap heap = new Heap(array.length);
        for (int i = 0; i < array.length; i++) {
            heap.array[i] = array[i];
            heap.count++;
        }
        
        heap.heapify();
        heap.print();
        //System.out.println(heap.getMaximum());
    }
}

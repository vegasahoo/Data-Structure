package Array;

import java.util.Arrays;

import Heap.Heap;

public class KthSmallestElement {
	
    static int smallest(int[] arr,int k){
        Heap h =new Heap(arr.length);
        for (int i = 0; i < arr.length; i++) {
            h.array[i]  = arr[i];

        }
        h.print();
        for (int i = 0; i <arr.length ; i++) {
            h.percolateDown(i);

        }
        return h.array[arr.length-k];
    }
    
    static int kthSmallest(int[] arr, int k) {
    	Arrays.sort(arr);
    	return arr[k-1];
    }

    public static void main(String[] args) {
        int[] arr = {1,4,3,2,6,7,8,5,0};
        System.out.println(kthSmallest(arr,5));
    }
}

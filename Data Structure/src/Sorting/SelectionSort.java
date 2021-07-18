package Sorting;

public class SelectionSort {
	
	public void swap(int[] arr, int i, int j) {
		int  temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public void sort(int[] arr) {
		
		for(int i =0 ;i< arr.length-1;i++) {
			int min = i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[min]) {
					min = j;
				}
			}
			swap(arr, i, min);
		}
	}
}
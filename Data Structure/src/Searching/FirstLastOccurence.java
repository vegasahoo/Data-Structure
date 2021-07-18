package Searching;

public class FirstLastOccurence {
	
	static int last(int[] arr, int data) {
		int res = 0;
		int low = 0, high= arr.length-1;
		
		while(low<=high) {
			int mid = low+(high-low)/2;
			if(arr[mid]>data) {
				high = mid-1;
			}
			else if(arr[mid]<data) {
				low = mid+1;
			}
			else {
				res = mid;
				low=mid+1;
			}
		}
		return res;
	}
	
	static int first(int[] arr, int data) {
		int res = 0;
		int low = 0, high= arr.length-1;
		
		while(low<=high) {
			int mid = low+(high-low)/2;
			if(arr[mid]>data) {
				high = mid-1;
			}
			else if(arr[mid]<data) {
				low = mid+1;
			}
			else {
				res = mid;
				high= mid-1;
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 5, 5, 5, 67, 123, 125 };
		System.out.println(first(arr,5));
		System.out.println(last(arr,5));
	}

}

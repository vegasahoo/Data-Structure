package Searching;


public class AdjacentDifferByK {
	
	static int findIndex(int[] arr, int k, int target) {
		int i = 0;
		while(i<arr.length) {
			if(arr[i]== target) {
				return i;
			}
			
			i+= Math.max(1, Math.abs((arr[i]-target))/k);
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int[] arr = {20,40,50,70,70,60};
		System.out.println(findIndex(arr,20,60));
	}

}

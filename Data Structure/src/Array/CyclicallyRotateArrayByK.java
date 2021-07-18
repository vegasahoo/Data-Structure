package Array;

public class CyclicallyRotateArrayByK {

    static void rotateArray(int[] arr, int k){
        int n = arr.length;
        int[] newArr = new int[n];
        for(int i =0;i<n;i++){
            newArr[(i+k)%n] = arr[i];
        }
        for(int i =0;i<n;i++){
            System.out.println(newArr[i]);
        }
    }
    
    
    static void rotate(int[] arr, int k) {
    	int n = arr.length;
    	int[] newArr = new int[n];
    	
    	for(int i=0;i<n-k;i++) {
    		newArr[i+k] = arr[i];
    	}
    	
    	for(int i=0;i<k;i++) {
    		newArr[i] = arr[n-k+i];
    	}
    	
    	for(int i =0; i<n;i++) {
    		System.out.println(newArr[i]);
    	}
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        
        //CyclicallyRotateArrayByK.rotateArray(arr,2);
        rotate(arr,2);
    }
}

package Searching;

public class MissingAndRepeating {
	
	static int[] findTwoElement(int arr[], int n) {
        // code here
        
        int[] list = new int[2];
        for(int i=0;i<n;i++){
            if(arr[Math.abs(arr[i])%n]<0){
                list[0] = Math.abs(arr[i]);
            }
            else{
                arr[Math.abs(arr[i])%n] = -arr[Math.abs(arr[i])%n];
            }
        }
        
        for(int i =0; i<n;i++){
            if(arr[i]>0){
                if(i==0){
                    list[1] = n;    
                }
                else{
                    list[1] = i;    
                }
                
            }
        }
        return list;
    }
	
	public static void main(String[] args) {
		int[] arr = {1,3,3};
		int[] res = findTwoElement(arr, arr.length);
		System.out.println(res[0]+" "+res[1]);
	}

}

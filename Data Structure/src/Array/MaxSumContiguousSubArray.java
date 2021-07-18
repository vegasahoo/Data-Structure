package Array;

//find Largest sum contiguous Subarray
//kedane's Algorithm
public class MaxSumContiguousSubArray {

    static int maxSubarraySum(int arr[]){

        // Your code here
        int sum1 =0;
        int sum= 0;
        for(int i=0; i<arr.length;i++){
            sum+=arr[i];
            if(sum1<sum){
                sum1=sum;
            }
            if(sum<0){
                sum =0;
            }
        }
        return sum1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,-2,5};
        System.out.println(MaxSumContiguousSubArray.maxSubarraySum(arr));
    }
}

package Array;

public class MaximumProductSubArray {

    public int maxProd(int[] nums){
        int maxVal = nums[0];
        int minVal = nums[0];
        int maxProd =  nums[0];


        for (int i = 1 ; i < nums.length ; i++) {
            if(nums[i]<0){
                int temp = maxVal;
                maxVal = minVal;
                minVal = temp;
            }

            maxVal = nums[i]>nums[i]*maxVal?nums[i]:nums[i]*maxVal;
            minVal = nums[i]<nums[i]*minVal?nums[i]:nums[i]*minVal;
            maxProd = maxProd>maxVal?maxProd:maxVal;
        }
        return maxProd;
    }

    public static void main(String[] args) {
        int[] nums = {2,-3,-4,5,-1,0};
        MaximumProductSubArray ms = new MaximumProductSubArray();
        System.out.println(ms.maxProd(nums));
    }

}

package Array;

public class FindDuplicateInArrayOfNIntegers {
    public static int findDuplicate(int[] nums) {
        int n  = nums.length;
        for(int i =0;i<n;i++){
            nums[nums[i]%(n)] += n;
        }
        for(int i =0;i<n;i++){
            if(nums[i]/n>=2){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {3,1,1,1,2};
        System.out.println(FindDuplicateInArrayOfNIntegers.findDuplicate(nums));
    }
}

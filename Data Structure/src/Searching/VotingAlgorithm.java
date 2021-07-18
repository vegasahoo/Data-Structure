// This voting algorithm works only when the frequency is more than n/2;
//Moore's voting algorithm


package Searching;

public class VotingAlgorithm {
	
	static int findMajor(int[] nums) {
		int majIndex = 0;
		int count = 1;
		
		for(int i = 1; i<nums.length;i++){
			if(nums[majIndex] == nums[i]) {
				count++;
			}
			else {
				count--;
			}
			
			if(count == 0) {
				count = 1;
				majIndex = i;
			}
			
		}
		return nums[majIndex];
	}
	
	public static void main(String[] args) {
		int[] nums = {10,11,12,12,13,14,12,12,12,12};
		System.out.println(findMajor(nums));
	}

}

package LinkedList;

import Stack.Stack;

public class ReverseKGroup {

    public void reverse(int[] nums, int k){
        boolean flag = true;
        Stack stk = new Stack(k);
        stk.push(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if(i%k == 0){
                flag = ((i/k)%2==0)?true:false;
            }
            if(flag){
                stk.push(nums[i]);
            }
            if(!flag){
                while(!stk.isEmpty()){
                    System.out.println(stk.pop());
                }
                System.out.println(nums[i]);
            }
        }
        while(!stk.isEmpty()){
            System.out.println(stk.pop());
        }
    }
    public static void main(String[] args) {
        ReverseKGroup rvk = new ReverseKGroup();
        int[] nums = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int k = 20;
        rvk.reverse(nums, k);
    }
}

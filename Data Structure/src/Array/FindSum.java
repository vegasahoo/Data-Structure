package Array;
public class FindSum {

    static void printSum(int[] num, int target){
        int sum =0;
        int i =0;
        for(int j=i; j < num.length;j++){
            sum=sum+num[j];
            while(sum>target){
                sum-= num[i];
                i++;
            }
            if(sum == target){
                System.out.println(num[j]);
            }
        }
    }

    public static void main(String[] args){
        int[] num = {1,2,3,7,5};
        FindSum.printSum(num, 12);
    }
}

package Array;

public class MoveNegNumsToOneSide {

    static void moveNegNums(int[] arr){
        int neg = 0;
        int pos = arr.length - 1;
        while(neg<=pos){
            if(arr[neg]>=0 && neg!=pos){
                int temp = arr[pos];
                arr[pos] = arr[neg];
                arr[neg] = temp;
                pos--;
            }
            else{
                neg++;
            }
        }
    }

    static void reArrange(int arr[])
    {
        int j = 0, temp;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,3,6,8,-4,-5};
        MoveNegNumsToOneSide.moveNegNums(arr);
        for(int i =0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

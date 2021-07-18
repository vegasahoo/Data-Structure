package Array;


//Find Min & Max of an Array
public class FindMinMaxofArray {
    public static void findMinMax(int[] arr){
        int min = arr[0];
        int max = arr[0];
        for(int i =1; i<arr.length;i++){
            min = arr[i]<min?arr[i]:min;
            max = arr[i]>max?arr[i]:max;
        }
        System.out.println("Minimum is: "+min);
        System.out.println("Maximum is: "+max);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,100,4,5};
        FindMinMaxofArray.findMinMax(arr);
    }
}

package Array;


//Sort an Array containing only 0,1,2 Without using Sorting Algorithm
public class Sort012WithoutSortingAlgo {

    static void swap(int[] arr, int a, int b){
        int temp = arr[b];
        arr[b] = arr[a];
        arr[a] =temp;
    }

    static void sort012(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, mid, low);
                mid++;
                low++;
            } else if (arr[mid] == 2) {
                swap(arr,mid, high);
                high--;

            } else {
                mid++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 2, 0};
        Sort012WithoutSortingAlgo.sort012(arr);
        for(int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}

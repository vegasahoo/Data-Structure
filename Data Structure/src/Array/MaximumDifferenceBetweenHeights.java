package Array;

import java.util.Arrays;

public class MaximumDifferenceBetweenHeights {
    static int getMinDiff(int[] arr, int n, int k) {
        if (n == 1){
            return 0;
        }
        Arrays.sort(arr);

        int ans = arr[n-1] - arr[0];

        int small = arr[0] + k;
        int big = arr[n-1] - k;
        int temp = 0;

        if (small > big)
        {
            temp = small;
            small = big;
            big = temp;
        }

        for (int i = 1; i < n-1; i ++)
        {
            int subtract = arr[i] - k;
            int add = arr[i] + k;
            if (subtract >= small || add <= big)
                continue;
            if (big - subtract <= add - small)
                small = subtract;
            else
                big = add;
        }
        System.out.println(Math.min(ans, big - small));
        return 1;

    }
    public static void main(String[] args) {
        int[] arr = {6, 1, 9, 1, 1, 7, 9, 5, 2, 10};
        MaximumDifferenceBetweenHeights.getMinDiff(arr, arr.length,4);
    }

}

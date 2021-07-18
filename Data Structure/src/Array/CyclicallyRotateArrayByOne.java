package Array;

public class CyclicallyRotateArrayByOne {

    static void rotateArray(int[] a){
        int n =a.length;
        int temp = a[n-1];
        for (int i = n-1; i > 0 ; i--) {
            a[i] = a[i-1];
        }
        a[0] = temp;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        CyclicallyRotateArrayByOne.rotateArray(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}

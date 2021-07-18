package Array;

import java.util.HashSet;
import java.util.Set;


//Union of 2 arrays without duplicate entry
public class UnionOfArrays {

    static void unionArray(int[] a1, int[] a2){
        Set<Integer> unionArray = new HashSet<Integer>();
        for(int i =0; i<a1.length;i++){
            unionArray.add(a1[i]);
        }
        for(int i =0; i<a2.length;i++){
            unionArray.add(a2[i]);
        }
        System.out.println(unionArray);
    }

    public static void main(String[] args) {
        int[] a1 = {1,2,3,4,5};
        int[] a2 = {1,2,3};
        UnionOfArrays.unionArray(a1,a2);
    }
}

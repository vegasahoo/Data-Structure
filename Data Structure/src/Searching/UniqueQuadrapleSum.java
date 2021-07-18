package Searching;

import java.util.ArrayList;
import java.util.Arrays;

public class UniqueQuadrapleSum {
	
	static ArrayList<ArrayList<Integer>> fourSum(int[] arr, int m) {
        ArrayList<ArrayList<Integer>> list1 = new ArrayList<ArrayList<Integer>>();
        Arrays.sort(arr);
        for(int i =0;i<arr.length-3;i++){
            if(i!=0&&arr[i]==arr[i-1])
	          continue;
            for(int j = i+1; j<arr.length-2;j++){
                if(j!=i+1&&arr[j]==arr[j-1])
	            continue;
                int k = j+1;
                int l = arr.length-1;
                while(k<l) {
        			if(k!=l && arr[l] + arr[k] + arr[i] +arr[j] == m) {
        			    ArrayList<Integer> list = new ArrayList<Integer>();
        				list.add(arr[i]);
        				list.add(arr[j]);
        				list.add(arr[k]);
        				list.add(arr[l]);
        				list1.add(list);
        				k++;
        				l--;
        				while(k<l &&arr[l]==arr[l+1] ){
	                        l--;
	                    }
	 
	                    while(k<l &&arr[k]==arr[k-1]){
	                        k++;
	                    }
        			}
        			else if(arr[l] + arr[k] + arr[i] +arr[j] < m ) {
        				k++;
        			}
        			else {
        				l--;
        			}
                }
            } 
            
        }
        return list1;
    }
	
	public static void main(String[] args) {
		int[] arr = {0,0,2,1,1};
		int target = 3;
	
		ArrayList<ArrayList<Integer>> list1 = new ArrayList<ArrayList<Integer>>();
		list1 = fourSum(arr,target);
		if(list1.isEmpty()) {
			System.out.println("No Quadraple found");
		}
		
		for(ArrayList<Integer> list: list1) {
			for(int i : list) {
				System.out.println(i+ " ");
			}
			System.out.println("$");
		}
		
	}

}

package Searching;

import java.util.ArrayList;

public class ValueEqualIndex {
	
	static ArrayList<Integer> valueIndex(int[] arr){
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i = 0; i< arr.length;i++) {
			if(arr[i]==i+1) {
				list.add(i+1);
			}
		}
		return list;
	}
	
	public static void main(String[] args) {
		int[] arr = {15, 2, 3, 12, 7};
		ArrayList<Integer> list = new ArrayList<Integer>();
		list = valueIndex(arr);
		System.out.println(list);
	}

}

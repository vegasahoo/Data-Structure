package Searching;

public class CountSquares {
	
	
	static int count(int n) {
		int count = 0;
		
		for(int i =1; i*i <n; i++) {
			count++;
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(count(9));
	}

}

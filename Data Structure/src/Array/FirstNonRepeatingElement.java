package Array;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingElement {
	
	
	static char find(String str) {
		
		int count=1;
		char[] arr = str.toCharArray();
		HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
		for(int i =0; i<arr.length;i++) {
			if(charMap.containsKey(arr[i])) {
				if(charMap.get(arr[i])<0) {
					continue;
				}
				else {
					charMap.put(arr[i], -charMap.get(arr[i]));
				}
			}
			else {
				charMap.put(arr[i], count);
				count++;
			}
		}
		
		int min = 0;
		char minKey = ' ';		
		for(Map.Entry<Character, Integer> c : charMap.entrySet()) {
			if(c.getValue()> 0) {
				min = c.getValue();
				minKey = c.getKey();
				break;
			}
		}
		
		for(Map.Entry<Character, Integer> c : charMap.entrySet()) {
			if(c.getValue()> 0 && c.getValue()<min) {
				min = c.getValue();
				minKey = c.getKey();
			}
		}
		return minKey;
	}
	
	public static void main(String[] args) {
		String str = "eello Wrld";
		System.out.println(find(str));
	}

}

package Array;

import java.util.HashMap;
import java.util.Map;

public class BuildCity {
	
	public static int solve(int[] arr, int n){
        HashMap<Integer, Integer> build = new HashMap<Integer, Integer>();
        int count = 0;

        for(int i =0 ; i <n ;i++){
            if(build.containsKey(arr[i])){
                build.put(arr[i], build.get(arr[i])+1);
            }
            else {
            build.put(arr[i], 1);
            }
        }

        for(Map.Entry<Integer, Integer> b : build.entrySet()){
            if(b.getKey() == 1){
            	if(b.getValue()<=1) {
            		continue;
            	}
            	else {
            		count+= b.getValue()*(b.getValue()-1)/2;
            		continue;
            	}
            }
            if(build.containsKey(b.getKey()*b.getKey())){
                count+= b.getValue()*build.get(b.getKey()*b.getKey());
            }
        }
        return count;
    }
		
	public static void main(String[] args) {
		int[] arr = {1,2,2,4,4,7,4,4,4,4,4,4,1};
		System.out.println(solve(arr,arr.length));
	}

}

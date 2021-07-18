package Sorting;


public class Test {
	
	public static void main(String[] args) {
		
		int[] a = {4,3,2,10,12,1,5,6};
		
		BubbleSort bs = new BubbleSort();
		SelectionSort ss = new SelectionSort();
		InsertionSort is = new InsertionSort();
		MergeSort ms = new MergeSort();
		QuickSort qs = new QuickSort();
		
		bs.sort(a);
		ss.sort(a);
		is.sort(a);
		ms.sort(a, 0, a.length-1);
		qs.sort(a, 0, a.length-1);
		
		for(int i = 0; i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}

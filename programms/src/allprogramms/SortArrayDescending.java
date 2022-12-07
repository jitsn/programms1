package allprogramms;

import java.util.Arrays;

public class SortArrayDescending {
public static void main(String[] args) {
	int a[]= {23,56,32,11,57,888,4432,11235,66767};
	
	for(int i=0;i<a.length;i++) {
		System.out.print(a[i]+" ");
	}
	System.out.println();
	System.out.println("array sorted in descending order: ");
	Arrays.sort(a);
		for(int i=a.length-1;i>=0;i--) {
		System.out.print(a[i]+" ");
	}
}
}

package allprogramms;

import java.util.Arrays;

public class FindLargestNumFromArray {
public static void main(String[] args) {
	int a[]= {12,45,78,4566,44444,33,2222,333467,54,555,555555};
	System.out.println("---printed given array---");
	for(int i=0;i<=a.length-1;i++) {
		System.out.print(a[i]+" ");
	}
	Arrays.sort(a);
	System.out.println();
	System.out.println("---array sorted in ascending order---");
	for(int i=0;i<=a.length-1;i++) {
		System.out.print(a[i]+" ");
	}
	System.out.println();
	System.out.println("---array swapping---");

	for(int i=0;i<=a.length/2;i++) {
		int z;
		z=a[i];
		a[i]=a[(a.length-1)-i];
		a[(a.length-1)-i]=z;
		
	}
	for(int i=0;i<=a.length-1;i++) {
		System.out.print(a[i]+" ");
	}
	
	System.out.println();
	System.out.println("greatest number from array: "+a[0]);
}
}

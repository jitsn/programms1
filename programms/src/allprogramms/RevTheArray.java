package allprogramms;

public class RevTheArray {
public static void main(String[] args) {
	String a[]= {"i","am","abhijit"};
	for(int i=0;i<=a.length-1;i++) {
		System.out.print(a[i]+" ");
	}
	System.out.println();
	for(int i=a.length-1;i>=0;i--) {
		System.out.print(a[i]+" ");
	}
	
	
}
}

package allprogramms;

public class FindDuplicateStringFromArray {
public static void main(String[] args) {
	
	String a[]= {"abhi","jit","fgh","abhi","shubham","ganesh","fgh","abhi"};
	
	
	for(int i=0;i<=a.length-1;i++) {
		for(int j=i+1;j<=a.length-1;j++) {
			if(a[i]==a[j]) {
				System.out.println(a[j]);

			}					
		}

	}
}
}

package allprogramms;

public class FindDuplicateNumFromArray {
public static void main(String[] args) {
	int a[]= {1,2,46,7,2,1,55,3,46};
	
	for(int i=0;i<=a.length-1;i++) {
		for(int j=i+1;j<=a.length-1;j++) {
			if(a[i]==a[j])
				System.out.println(a[j]);
		}
	}
	}
}

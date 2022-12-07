package allprogramms;

public class FindLargestNumFrom3Nos {
public static void main(String[] args) {
	int a=678;
	int b=89;
	int c=365;
	
	if(a>b && a>c) {
		System.out.println("a is greater: "+a);
		
	}
	else if(b>a && b>c) {
		System.out.println("b is greater: "+b);
	}
	else {
		System.out.println("c is greater: "+c);
	}
}
}

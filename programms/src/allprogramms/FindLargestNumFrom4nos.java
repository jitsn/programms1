package allprogramms;

public class FindLargestNumFrom4nos {
public static void main(String[] args) {
	int a=23000;
	int b=7888;
	int c=890;
	int d=90;
	
	if(a>b && a>c && a>d) {
		System.out.println("a is greater :"+a);
	}
	else if(b>a && b>c && b>d) {
		System.out.println("b is greater :"+b);
	}
	else if(c>a && c>b && c>d) {
		System.out.println("c is greater :"+c);
	}
	else {
		System.out.println("d is greater :"+d);
	}
			
}
}

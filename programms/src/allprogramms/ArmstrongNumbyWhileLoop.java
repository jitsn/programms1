package allprogramms;

import java.util.Scanner;

public class ArmstrongNumbyWhileLoop {
public static void main(String[] args) {
	System.out.println("Enter number: ");
	Scanner G=new Scanner(System.in);
	int a=G.nextInt();
	int b,c=0,d=a;
	while(a>0) {
		b=a%10;
		c=c+(b*b*b);//for 4 numbers use c=c+(b*b*b*b)
		a=a/10;
	}
	if(d==c) {
		System.out.println("the number is armstrong");
	}
	else {
		System.out.println("the number is not armstrong");
	}
	G.close();
}
}

package allprogramms;

import java.util.Scanner;

public class EvenOdd {
public static void main(String[] args) {
	System.out.println("Enter number: ");
	Scanner F=new Scanner(System.in);
	
	int a=F.nextInt();
	if(a%2==0) {
		System.out.println("the number is even");
	}
	else {
		System.out.println("the number is odd");
	}
	F.close();
}
}

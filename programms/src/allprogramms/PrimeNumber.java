package allprogramms;
import java.util.Scanner;
public class PrimeNumber {
public static void main(String[] args) {
	System.out.println("Enter your number: ");
	Scanner F=new Scanner(System.in);
	int a=F.nextInt();
	int count=0;
	for(int i=1;i<=a;i++) {
		if(a%i==0) {
			count++;
		}
	}
	if(count==2) {
		System.out.println("The number is prime number");
	}
	else {
		System.out.println("the number is not prime number");
	}
	F.close();
}
}

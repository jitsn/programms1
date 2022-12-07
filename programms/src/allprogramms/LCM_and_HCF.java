package allprogramms;
import java.util.Scanner;
public class LCM_and_HCF {
public static void main(String[] args) {
	System.out.println("Enter your first value: ");
	Scanner G=new Scanner(System.in);
	int a=G.nextInt();
	System.out.println("Enter your second value: ");
	int b=G.nextInt();
	int HCF=1;
	for(int i=1;i<=a&&i<=b;i++) {
		if(a%i==0 && b%i==0)
			HCF=i;
	}
	System.out.println("HCF of two numbers: = "+HCF);
    int lcm=(a*b/HCF);
    System.out.println("LCM of two numbers: = "+lcm);
    G.close();
}
}

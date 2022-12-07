package allprogramms;
//git done
import java.util.Scanner;

public class ArmStrongNumForLoop {
public static void main(String[] args) {
	int b,c=0;

	//(1*3)+(3*3)+(5*3)=153 Armstrong number
	System.out.println("Enter your number: ");
	Scanner G=new Scanner(System.in);
	int a=G.nextInt();
	int d=a;

	for(int i=a;i>=0;i--) {
		b=a%10;//3,5.3,1.53
		c=c+(b*b*b);//27+125+1=153
		a=a/10;//15.3,1.53
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

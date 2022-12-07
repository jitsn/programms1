package allprogramms;

import java.util.Scanner;

public class ToFindFactorialNo {
public static void main(String[] args) {
	System.out.println("Enter number: ");
	Scanner G=new Scanner(System.in);
	int a=G.nextInt();
	int b=1;
	for(int i=1;i<=a;i++) {
		b=b*i;//1*1=1,1*2=2,2*3=6,6*4=24,24*5=120,120*6=720
	}
	System.out.println(b);
	G.close();
}
}

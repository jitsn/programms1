package starprogramms;

public class FourthQuadrant {
public static void main(String[] args) {
	int star=5;
	int space=0;
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=space;j++) {
			System.out.print(" ");
		}space++;
		for(int k=1;k<=star;k++) {
			System.out.print("*");
		}star--;
		System.out.println();
	}
}
}

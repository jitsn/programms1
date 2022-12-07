package starprogramms;

public class ThirdQuadrant {
public static void main(String[] args) {
	int  star=5;
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=star;j++) {
			System.out.print("*");
		}star--;
		System.out.println();
	}
}
}

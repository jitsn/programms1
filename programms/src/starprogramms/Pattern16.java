package starprogramms;

public class Pattern16 {
public static void main(String[] args) {
	for(int i=5;i>=1;i--) {
		for(int j=1;j<=5;j++){
			if(i==1||j==5) {
				System.out.print("*");
			}
			else if(j==5||j==i) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
	}
		System.out.println();
  }
 }
}
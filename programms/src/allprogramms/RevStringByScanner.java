package allprogramms;
import java.util.Scanner;
public class RevStringByScanner {
public static void main(String[] args) {
	System.out.println("enter your string value: ");
	Scanner G=new Scanner(System.in);
	String a=G.nextLine();
	String rev="";
	for(int i=a.length()-1;i>=0;i--) {
		rev=rev+(a.charAt(i));
	}
	System.out.print(rev);
	G.close();
}
}

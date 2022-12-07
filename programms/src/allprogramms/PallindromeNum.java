package allprogramms;

public class PallindromeNum {
public static void main(String[] args) {
	String a="121";
	String b="";
	
	for(int i=a.length()-1;i>=0;i--) {
		 b=b+(a.charAt(i));
	}
	System.out.println(b);
	if(a.equals(b)) {
		System.out.println("the given number is pallindrome");
	}
	else {
		System.out.println("the given number is not pallindrome");
	}
}
}

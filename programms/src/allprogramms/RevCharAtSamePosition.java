package allprogramms;

public class RevCharAtSamePosition {
public static void main(String[] args) {
	String a="i am optimus prime from planet cybertron";
	
	String sub[]=a.split(" ");
	String rev="";
	
	for(int i=0;i<sub.length;i++) {
		
	for(int j=sub[i].length()-1;j>=0;j--) {
		rev=rev+sub[i].charAt(j);
	}
	System.out.print(rev+" ");
	rev="";
	}
}
}

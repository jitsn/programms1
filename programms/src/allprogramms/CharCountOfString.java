package allprogramms;

public class CharCountOfString {
	public static void main(String[] args){

		String a="i am fine how are you?";
		int count=0;
		for(int i=0;i<=a.length()-1;i++) {
			if(a.charAt(i)!=' ') {
				count++;
			}
		}
		System.out.println(count);

}
}
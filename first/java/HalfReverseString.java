package first.java;

public class HalfReverseString {

	public static void main(String[] args) {
		String s = "keerthi";
		String reverse1 = "";
		String reverse2 = "";
		for(int i=0; i<s.length()/2;i++) {
			char c = s.charAt(i);
			reverse1 = c+reverse1 ;
		}
		for(int i=s.length()/2; i<s.length();i++) {
			char c = s.charAt(i);
			reverse2 = c+reverse2 ;
		}
		System.out.println(reverse1+reverse2);

	}

}

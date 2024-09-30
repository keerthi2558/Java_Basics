package first.java;

public class PolindromeString {

	public static void main(String[] args) {
		String s = "civic";
		String s1 = "";
		String s2 = "";
		for(int i =0; i<s.length()/2;i++) {
			char c = s.charAt(i);
			s1 = s1+c;
		}
		
		for(int i =s.length()-2;i<s.length();i++) {
			char c = s.charAt(i);
			s2 =c+s2;
		}
		
		for(int i = 0; i<2;i++) {
			char c1 = s1.charAt(i);
			char c2 = s2.charAt(i);
			if(c1 == c2) {
				
			}
			else {
				System.out.println("not a polindrome");
				return;
			}
		}
		System.out.println("polidrome");

	}
}
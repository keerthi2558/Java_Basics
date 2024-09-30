package first.java;

public class QnsPolindromeOrNot {

	public static void main(String[] args) {
		String s = "madam";
		for(int i=s.length()/2; i<s.length();i++) {
			char c1 = s.charAt(i);
			char c2 = s.charAt(s.length()-i-1);
			if(c1==c2) {
				
			}
			else {
				System.out.println("not a polindrome");
				return;
		}
		
	}
		System.out.println("polindrome");

}
}
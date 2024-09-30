package first.java;

public class FindIndexofChar {

	public static void main(String[] args) {
		String s = "keerthi";
		for( int i = 0; i<s.length();i++) {
			char c = s.charAt(i);
			if(c=='r')
				System.out.println(i);
		}
	}
}

package first.java;

public class WhileLoopStringReverse {

	public static void main(String[] args) {
		String s = "keerthi";
		String reverse = "";
		int i = 0;

		while( i < s.length()) {
			char c = s.charAt(i);
			reverse = c + reverse;
			
			i = i+1;

		}
		System.out.println(reverse);

	}

}

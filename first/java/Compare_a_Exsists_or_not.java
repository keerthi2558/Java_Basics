package first.java;

public class Compare_a_Exsists_or_not {

	public static void main(String[] args) {
		String s = "gopal";
		int i = 0;

		while (i < s.length()) {
			char c = s.charAt(i);
			if (c == 'a') {
				System.out.println('a' + "is exists");
			}
			i = i + 1;
		}
	}
}

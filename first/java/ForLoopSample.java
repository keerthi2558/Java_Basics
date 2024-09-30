package first.java;

public class ForLoopSample {

	public static void main(String[] args) {
		String s = "keerthi";
		int i = 0;

		while (i < s.length()) {
			char c = s.charAt(i);
			System.out.println(c + "1");
			i++;
		}

		String reverse = "";

		for (int j = 0; j < s.length(); j++) {
			char c = s.charAt(j);
			reverse = c + reverse;
		}

		System.out.println(reverse);

		for (int j = 0; j < s.length(); j++) {
			char f = s.charAt(j);
			char r = s.charAt(s.length() - j - 1);

			if (f != r) {
				System.out.print("Not a palindrome");
				break;
			}
		}

	}
}

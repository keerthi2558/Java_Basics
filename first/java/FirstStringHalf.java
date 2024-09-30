package first.java;

public class FirstStringHalf {
	public static void main(String[] args) {

		String s1 = "gopal";
		for (int i = 0; i < s1.length() / 2 + 1; i++) {
			char c = s1.charAt(i);
			System.out.print(c);

		}
		int i = 0;
		String s2 = "gopal";

		while (i < s2.length() / 2 + 1) {
			char c1 = s2.charAt(i);
			System.out.print(c1);
			i = i + 1;

		}

	}

}

package first.java;

public class SecondStringHalf {

	public static void main(String[] args) {
		
		
		String s1 = "keerthi";
		for (int i1 = s1.length() / 2; i1 < s1.length(); i1++) {
			char c2 = s1.charAt(i1);
			System.out.print(c2);
		}

		String s2 = "keerthi";
		int i2 = s2.length() / 2;
		while (i2 < s2.length()) {
			char c2 = s2.charAt(i2);
			System.out.print(c2);
			i2 = i2 + 1;
		}

	}
}
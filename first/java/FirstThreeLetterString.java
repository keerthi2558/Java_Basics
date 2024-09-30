package first.java;

public class FirstThreeLetterString {

	public static void main(String[] args) {
		String s = "keerthi";
		String k = "";
		for (int i =0; i<3;i++) {
			char c = s.charAt(i);
			k = k+c;
		}
		System.out.println(k);

	}

}

package first.java;

public class LastfourString {

	public static void main(String[] args) {
		String s = "pratyusha";
		String k = "";
		for (int i =s.length()-4; i<s.length();i++) {
			char c = s.charAt(i);
			k = k+c;
		}
		System.out.println(k);

	}

}

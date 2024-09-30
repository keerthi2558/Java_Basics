package first.java;

public class StringOddLetters {

	public static void main(String[] args) {
		String s = "pratyusha";
		String k= "";
		
		for (int i = 0; i < s.length(); i++) {
			if (i%2!=0) {
			char c = s.charAt(i);
			k = k+c;

			}			
		
	}
		System.out.println(k);
}
}

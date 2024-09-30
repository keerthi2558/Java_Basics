package first.java;

public class Reverse1stFourLetters {

	public static void main(String[] args) {
		String s = "pratyusha";
		String k = "";
		for (int i =0; i<s.length()/2;i++) {
			char c = s.charAt(i);
			k = c+k;
		}
		System.out.println(k);
	}

}

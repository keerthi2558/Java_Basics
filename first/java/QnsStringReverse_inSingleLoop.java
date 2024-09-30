package first.java;

public class QnsStringReverse_inSingleLoop {

	public static void main(String[] args) {
		String s = "hari keerthi";
		String s2 = "gopal swamy";
		String reverse1 = "";
		String reverse2 = "";
		int spaceindex = 0;
//here find the space index first & 
//store index value in a new variable (spaceindex)
		
		for (int j = 0; j < s2.length(); j++) {
			char c = s2.charAt(j);
			if (c == ' ') {
				spaceindex = j;
				continue;
			}
			if (spaceindex == 0) {
				reverse1 = c + reverse1;
			}
			else {
				reverse2 = c + reverse2;
			}
		}

		System.out.println(reverse1 + " " + reverse2);

	}

}

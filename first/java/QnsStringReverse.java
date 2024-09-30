package first.java;

public class QnsStringReverse {

	public static void main(String[] args) {
		String s = "hari keerthi";
		String s2 = "gopal swamy";
		String reverse1 = "";
		String reverse2 = "";
		int spaceindex = 0;
		//here find the space index first & 
		//store index value in a new variable (spaceindex) & 
		//here code optimisation done by using break statement

		for (int j = 0; j < s2.length(); j++) {
			char c = s2.charAt(j);
			if (c == ' ')
			{
				spaceindex = j;
				break;
			}
			reverse1 = c + reverse1;

		}


		for (int i = spaceindex; i < s2.length(); i++) {
			char c = s2.charAt(i);
			reverse2 = c + reverse2;

		}

		System.out.println(reverse1 + " " + reverse2);

	}
}

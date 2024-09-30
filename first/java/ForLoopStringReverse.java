package first.java;

public class ForLoopStringReverse {

	public static void main(String[] args) {
		String s = "gopal"; 
		  String reverse = "";
		  
		  for (int j = 0; j < s.length(); j++) {
			  char c = s.charAt(j);
			  reverse = c +reverse;
		  
		  } 
		  System.out.println(reverse);

	}

}

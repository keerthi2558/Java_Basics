package first.java;

public class CheckStringSizeEqualOrNot {

	public static void main(String[] args) {
		String s1 = "gopal";
		String s2 = "keerthi";
		for (int i = 0; i < 5; i++) {
			char c1 = s1.charAt(i);
			char c2 = s2.charAt(i);
			
			if (c1 != c2) {
				System.out.println("not equal");
				return;
			}
		}
		
		System.out.println("equal");
	}
		
}
		


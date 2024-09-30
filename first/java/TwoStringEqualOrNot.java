package first.java;

public class TwoStringEqualOrNot {

	public static void main(String[] args) {
		TwoStringEqualOrNot s = new TwoStringEqualOrNot();
		String s1 = "gopal";
		String s2 = "gopal";
		s.findTwoStringsSameorNot(s1, s2);

	}
	void findTwoStringsSameorNot(String s1, String s2) {
		
		for(int i=0; i<s1.length();i++) {
			char c1= s1.charAt(i);
			char c2 = s2.charAt(i);
			if(c1!=c2) {
				System.out.println("not equal");
				return;
			}
			
		}
		System.out.println("equal");
	}

}

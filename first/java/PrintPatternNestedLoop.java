package first.java;

public class PrintPatternNestedLoop {

	public static void main(String[] args) {
		String s = "keerthi";
		
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<=i;j++) {
				char c = s.charAt(j);
				
				
				System.out.print(c);
				
			}
			System.out.println();
		}
			

	}

}

package first.java;

public class DiamondPatternWithNestedForLoop {

	public static void main(String[] args) {
		int i =5;
		for(int a=1;a<=i;a++) {
			for(int b=i;b>=a;b--) {
				System.out.print(" ");
		}
			for(int b=1;b<=a;b++) {
				System.out.print("* ");
			}
			
			System.out.println();
	}
/*
	public static void main(String[] args) {
		int i = 5;
		for (int a = 1; a <= i; a++) {
			for (int b = 1; b <= i; b++) {

				if (b <= i - a) {
					System.out.print(" ");
				} else
					System.out.print("* ");

			}
			System.out.println();
		}
*/
	}
}
package first.java;

public class Question4 {
	public static void main(String[] args) {
		int i = 2;
		String s = " 1";

		/*
		 * while(i<100) { if (i%2==1) System.out.println("odd numbers =" + i ); i++; }
		 */

		while (i < 12) {
			if (i % 2 == 1)
				s = s + "," + i;

			i++;
		}

		System.out.print(s);

	}

}

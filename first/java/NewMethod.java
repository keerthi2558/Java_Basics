package first.java;

public class NewMethod {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 10) {
			if (i % 2 == 1) {
				System.out.print(i);

				if (i != 9)
					System.out.print(",");

			}
			i++;
		}
	}
}
package first.java;

public class AlternativeNumNestedForLoop {

	public static void main(String[] args) {
		for (int i = 1; i <= 8; i++) {
			for (int j = 1; j <= 8; j++) {
				int k = i + j;
				if (k % 2 == 0) {
					System.out.print(2);
				} else
					System.out.print(1);
			}
			System.out.println();
		}
	}
}

package first.java;

public class NestedLoopPrintEven {

	public static void main(String[] args) {
		int i = 0;

		while (i <= 7) {

			int j = 0;
			while (j <= i) {

				System.out.print(2 * i);

				j++;
			}
			System.out.println();
			i++;
		}

	}

}

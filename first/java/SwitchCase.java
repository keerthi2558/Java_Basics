package first.java;

public class SwitchCase {
	public static void main(String[] args) {

		int number = 10;

		switch (number % 2) {
		case 0:
			System.out.println("even");
			break;
		default:
			System.out.println("odd");
			break;
		}
		int x = 2;
		switch (x) {
		default:
			System.out.println("Still no idea what x is");

		case 1:
			System.out.println("x is equal to 1");
			break;
		case 2:
			System.out.println("x is equal to 2");
			break;
		case 3:
			System.out.println("x is equal to 3");
			break;

		}
		/*
		 * byte var = 100; switch(var) { case 100: System.out.println("var is 100");
		 * break; case 200: System.out.println("var is 200"); break; default:
		 * System.out.println("In default"); }
		 */
		do {
			System.out.println(100);
		} while (false);

		System.out.println("Bye");
		 int start = 1;
	        int sum = 0;
	        do {
	            if(start % 2 == 0) {
	                continue;
	            }
	            sum += start;
	        } while(++start <= 10);
	        System.out.println(sum);
	}
}
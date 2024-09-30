package first.java;

public class SwapTwoVariables {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
	

		System.out.println("Before swapping + a =" +a +" b ="+b);


		//Write the code here to swap a value into b and b's value into a
//		int val1 = a;
//		int val2 = b;
//		a = val2;
//		b = val1;
		int val = a;
		a = b;
		b = val;
		
		
		System.out.println("After swapping + a =" +a +" b ="+b);
		}

		
	}


package first.java;

public class CalculatorProgramUsingSwitch {

	public static void main(String[] args) {
		String s = "-";
		int a = 5;
		int b = 4;
		
		switch(s) {
		case "+":
			
			System.out.println(a+b);
			break;
		case "-":
			
			System.out.println(a-b);
			break;
		case "*":
			
			System.out.println(a*b);
			break;
		case "/":
			
			System.out.println(a/b);
			break;
		
		}

	}

}

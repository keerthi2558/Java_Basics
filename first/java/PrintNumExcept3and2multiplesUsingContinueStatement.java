package first.java;

public class PrintNumExcept3and2multiplesUsingContinueStatement {
//	To skip the multiples of 2 and 3 
//	Step 1: write a for loop to iterate upto 20 or any number
//	Step 2: Check if the number multiple of 2 if yes skip that number use continue statement
//	Step 3: if it is 3 multiple skip the number using with continue statement
//	Step 4: Now Print the final result 

	public static void main(String[] args) {
		
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) 
				continue;
			if(i%3==0)
				continue;
		System.out.println(i);
			
	}

}
}
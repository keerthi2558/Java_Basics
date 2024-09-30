package first.java;

public class Breakstatement {
// String consists 'r' then break the loop
//	Step 1: Take string variable as "savitri"
//	Step 2: Write a loop to iterate the characters in string
//	Step 3: if any of the char matches the letter 'r' terminate the loop using break statement
//	Step 4: Print the characters
	public static void main(String[] args) {
		String s = "savitri";
		int i = 0;
		
		while(i<=s.length()) {
			char c = s.charAt(i);
			if(c=='r')
				break;
			System.out.print(c);
			i++;
		}

	}

}

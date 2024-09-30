package first.java;
//Count the number of vowels in each string of a string array
public class VowelsInEachString {

	public static void main(String[] args) {
		String name[] = {"hari","keerthi"};
		int count = 0;
		for(int i=0;i<name.length;i++) {
			
			String s = name[i];
			count = 0;
			for(int j=0;j<s.length();j++) {
				char c = s.charAt(j);
				if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
					count++;
					}
			}
			System.out.println(s +" =" + count+ " vowels");
//			count = 0;
			
		}
		

	}
}


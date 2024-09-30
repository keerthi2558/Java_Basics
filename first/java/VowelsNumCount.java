package first.java;

public class VowelsNumCount {

	public static void main(String[] args) {
		String s = "prathyusha";
		int i= 0;
		int count = 0;
		while(i<10) {
			char c = s.charAt(i);
			if(c =='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				count++;
			
			}
			i++;
	}
		System.out.println(count + "vowels");

}
}
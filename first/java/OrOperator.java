package first.java;

public class OrOperator {

	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			if((i%2==0||i%5==0)&&(i%6!=0)) {
				System.out.println(i);
			}
			
		}

	}

}
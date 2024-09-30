package first.java;

public class PracticeCode {
	public static void main(String[] args) {
		int i = 4;
		if (i % 2 != 0) {
			System.out.println("odd number");
		} else {
			System.out.println("even number");
		}
		System.out.println("---------------------");
		int j = 2;

		switch (j % 2) {
		case 1:
			System.out.println("odd number");
			break;
		default:
			System.out.println("even number");
			break;

		}
		System.out.println("----------------------");
		String s = "monday";
		switch (s) {
		case "monday":

		case "tuesday":

		case "wednesday":

		case "thursday":

		case "friday":
			System.out.println("uff it's weekday");
			break;
		case "saturday":

		case "sunday":
			System.out.println("yayy it's weekend");
			break;

		}
		System.out.println("------------------");
		int k = 150;
		while(k<=200) {
			if(k%7==0)
				System.out.println(k);
			k++;
		}
		System.out.println("------------------");
		int m = 40;
		int sum = 0;
		while(m<=80) {
			if(m%2==0)
				sum = sum+m;
			m++;

		}
		System.out.println(sum);
		System.out.println("----------------------");
		int n ;

		for(n=200;n>=25;n--) {
			if(n%2!=0)

				System.out.println(n);
		}
		System.out.println("------------------------");
		
		for(int p = 5;p>=1;p--) {
			for(int q =1; q<=p;q++) {
				System.out.print("* ");

			}

			System.out.println();


		}
		System.out.println("------------------------------");
		
}
}

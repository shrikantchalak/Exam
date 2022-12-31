package demo;

public class Armstrong {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Number ");
//		int n = sc.nextInt();
		int n = 153;// 370,371,407
		int n2 = n;
		int arm = 0;

		while (n > 0) {
			int rem = n % 10;
			arm = (rem * rem * rem) + arm;
			n = n / 10;

		}
		System.out.println(arm);
		if (n2 == arm) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not A Armstrong Number");
		}

	}

}

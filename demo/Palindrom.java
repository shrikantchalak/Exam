package demo;

public class Palindrom {

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Number ");
//		int n = sc.nextInt();
		int n = 35453;
		int n2 = n;
		int rev = 0;

		while (n > 0) {
			int r = n % 10;
			rev = (rev * 10) + r;
			n = n / 10;

		}
		System.out.println(rev);
		if (n2 == rev) {
			System.out.println("Number Is Palindrom");
		} else {
			System.out.println("Number Is Not Palindrom");
		}

	}

}

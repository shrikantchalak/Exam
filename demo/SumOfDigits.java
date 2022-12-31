package demo;

public class SumOfDigits {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Number ");
//		int n = sc.nextInt();
		int n = 126;
		int sum = 0;

		while (n > 0) {
			int r = n % 10;
			sum = sum + r;
			n = n / 10;
		}
		System.out.println(sum);
	}

}

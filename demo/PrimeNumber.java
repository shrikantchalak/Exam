package demo;

public class PrimeNumber {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Number ");
//		int n = sc.nextInt();

		int n = 17;
		int Count = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				Count++;
			}
		}
		if (Count == 2)
			System.out.println("Prime Number");
		else
			System.out.println(" Not Prime Number");
	}
}

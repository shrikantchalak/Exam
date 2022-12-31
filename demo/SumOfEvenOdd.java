package demo;

public class SumOfEvenOdd {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Number ");
//		int n = sc.nextInt();

		int n = 12;
		int sum = 0;
		int i;

		if (n % 2 == 0) {
			for (i = 0; i <= n; i = i + 2) {
				sum = sum + i;
			}
			System.out.println("Sum Of Even Number " + sum);
		} else {
			for (i = 1; i <= n; i = i + 2) {
				sum = sum + i;
			}
			System.out.println("Sum Of Odd Number " + sum);
		}
	}

}

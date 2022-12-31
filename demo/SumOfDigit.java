package demo;

//   Insert number in function and add of digit till single get digit
public class SumOfDigit {

	public static void main(String[] args) {
		int n = 546;
		int sum = 0;

		while (n > 9) {
			sum = 0;
			while (n > 0) {
				int r = n % 10;
				sum = sum + r;
				n = n / 10;
			}
			n = sum;
		}
		System.out.println(sum);
	}
}

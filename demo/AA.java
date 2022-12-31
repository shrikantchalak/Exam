package demo;

public class AA {

	public static void main(String[] args) {
		int num = 1, n = 1;

		while (n <= 25) {
			int j = 1;
			int count = 0;

			while (j <= num) {
				if (num % j == 0) {
					count++;
				}
				j++;
			}

			if (count == 2) {
				System.out.print(num + " ");
				n++;
			}
			num++;
		}
	}
}

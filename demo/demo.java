package demo;

public class demo {
	public static void main(String[] args) {
		int ct = 0, n = 0, num = 1, j = 1;
		while (n < 25) {

			j = 1;
			ct = 0;

			while (j <= num) {
				if (num % j == 0) {
					ct++;
				}
				j++;
			}

			if (ct == 2) {
				System.out.printf("%d ", num);
				n++;
			}
			num++;
		}
	}
}
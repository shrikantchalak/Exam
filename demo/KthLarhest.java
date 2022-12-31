package demo;

public class KthLarhest {

	public static void main(String[] args) {

		int[] a = { 58, 21, 85, 95, 1, 27, 54, 67, 7 };
		int k = 1;

		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {

				if (a[i] < a[j]) {

					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}

			if (i == k - 1) {
				System.out.println("maximum number is " + a[i]);
			}

		}

	}
}

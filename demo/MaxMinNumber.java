package demo;

class MaxMinNumber {

	public static void main(String[] args) {

		int[] arr = { 19, 58, 21, 85 };

		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {

			// max
			if (arr[i] > max) {// max
				max = arr[i];
			}
			// min
//			if (arr[i] < max) {
//				max = arr[i];
//			}
		}
		System.out.println("maximum number is " + max);
	}
}

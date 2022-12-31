package demo;

class SecondMin {
	public static void main(String[] args) {
		int[] arr = { 1, 4, 8, 3, 10 };
		int min = arr[0];
		int secMin = arr[1];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				secMin = min;
				min = arr[i];
			} else if (arr[i] < secMin && arr[i] != min) {
				secMin = arr[i];
			}
		}

		System.out.println(min);
		System.out.println(secMin);
	}
}
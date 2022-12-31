package Sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[] = { 8, 84, 93, 6, 27, 14, 25, 1, 16 };

		for (int i = 0; i < arr.length - 1; i++) {

			int smallest = i;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[smallest] > arr[j]) {

					smallest = j;
				}
			}
			// swap
			int temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}

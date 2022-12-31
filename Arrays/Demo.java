package Arrays;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 9, 1, 2, 3, 4, 8, 4, 5, 6, 6 };
		Arrays.sort(arr);
		int[] temp = new int[arr.length];
		int j = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		System.out.println(j);
		temp[j++] = arr[arr.length - 1];
		System.out.println(j);
		for (int i = 0; i < arr.length; i++) {
			arr[i] = temp[i];
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}

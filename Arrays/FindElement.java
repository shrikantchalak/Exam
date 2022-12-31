package Arrays;

public class FindElement {

	public static void main(String[] args) {
		int[] arr = { 56, 68, 68, 27, 27, 15, 65, 24, 61 };
		int[] temp = new int[arr.length];
		int n = 2, count = 0;

		// First Duplicate Element
		System.out.println("First Duplicate Element");
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j] && i != j) {
					count++;
					System.out.println("First Duplicate Element is " + arr[i]);
					break;
				}
			}
		}

		// remove duplicates
		System.out.println("Remove Duplicate Element");
		int k = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[k] = arr[i];
				k++;
			}
		}
		temp[k] = arr[arr.length - 1];

		// Find Element
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				count++;
				break;
			}
		}
		if (count > 0) {
			System.out.println("Found");
		} else {
			System.out.println("Not Found");
		}

		// delete element
//		for (int i = 0; i < arr.length; i++) {
//			if (n == arr[i]) {
//				for (int j = i; j < arr.length - 1; j++) {
//					arr[j] = arr[j + 1];
//					count++;
//				}
//				break;
//			}
//		}
//		if (count > 0) {
//			System.out.println("Element Deleted");
//		} else {
//			System.out.println("Not Found");
//		}
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}

	}
}

package Arrays;

public class FirstDuplicate {

	public static void main(String[] args) {

		int[] arr = { 56, 68, 27, 68, 27, 15, 65, 24, 61 };
		int[] temp = new int[arr.length];
		int n = 2, count = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j] && i != j) {
					count++;
					System.out.println("First Duplicate Element is " + arr[i]);
					break;
				}
			}
			if (count > 0) {
				break;
			}
		}
	}
}

package StringManipulation;

//Write a function which will Remove the repeating character in the string.

public class RepeatedElements {
	public static void main(String[] args) {
		String str = "amnazoann";
		char[] arr = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[i]);
					break;
				}
			}

		}

	}

}

package StringManipulation;

// Write a function which will Remove the repeating character in the string.

public class RemoveDuplicateString {

	public static void main(String[] args) {
		String str = "amazonmmmoooo";
		String str2 = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (str2.indexOf(ch) == -1) {
				str2 += ch;
			}
		}
		System.out.println(str2);
	}
}

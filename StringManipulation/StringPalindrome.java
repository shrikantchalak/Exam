package StringManipulation;

public class StringPalindrome {

	public static void main(String[] args) {

		String str = "javaj";

		String sb = new StringBuilder(str).reverse().toString();
		if (str.equals(sb)) {
			System.out.println("Palndrome");
		} else {
			System.out.println("Not Palindrome");
		}

		// ====================================

		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (str.equals(rev)) {
			System.out.println("Palndrome");
		} else {
			System.out.println("Not Palindrome");
		}

		// ====================================

	}
}

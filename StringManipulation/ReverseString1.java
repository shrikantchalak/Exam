package StringManipulation;

public class ReverseString1 {

	public static void main(String[] args) {

		String str = "name";
		String nstr = "";

		for (int i = 0; i < str.length(); i++) {
			nstr = str.charAt(i) + nstr;
		}
		System.out.println(nstr);

		// =============================================================

		// String str = "name";
		char[] ch = str.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.print(ch[i]);
		}
		System.out.println();

		// =============================================================

		// String str = "name";

		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		System.out.println();

		// =============================================================

		// String str = "name";

		StringBuffer sb1 = new StringBuffer(str);
		System.out.println(sb1.reverse());

		StringBuilder sb2 = new StringBuilder(str);
		System.out.println(sb2.reverse());

	}
}
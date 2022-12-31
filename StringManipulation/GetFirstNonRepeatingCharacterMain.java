package StringManipulation;

public class GetFirstNonRepeatingCharacterMain {
	public static void main(String[] args) {

		String str = "amazonzddadan";

		char ch[] = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {
			if (str.lastIndexOf(ch[i]) == str.indexOf(ch[i]))
				System.out.print(ch[i]);
		}

	}
}

package demo;

import java.util.Stack;

public class checkParentheses {

	public boolean isValid(String str) {

		Stack<Character> leftSymbols = new Stack<>();

		for (char c : str.toCharArray()) {

			if (c == '(' || c == '{' || c == '[') {
				leftSymbols.push(c);
			}

			else if (c == ')' && !leftSymbols.isEmpty() && leftSymbols.peek() == '(') {
				leftSymbols.pop();
			} else if (c == '}' && !leftSymbols.isEmpty() && leftSymbols.peek() == '{') {
				leftSymbols.pop();
			} else if (c == ']' && !leftSymbols.isEmpty() && leftSymbols.peek() == '[') {
				leftSymbols.pop();
			}

			else {
				return false;
			}
		}
		return leftSymbols.isEmpty();
	}

}
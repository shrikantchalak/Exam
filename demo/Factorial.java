package demo;

import java.util.Scanner;

public class Factorial {

	static int fact(int n) {
		if (n == 1)
			return 1;
		else
			return n * fact(n - 1);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number ");
		int n = sc.nextInt();

		int result = fact(n);
		System.out.println(result);

	}

}

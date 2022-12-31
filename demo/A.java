package demo;

import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = sc.nextInt();
		// int[] arr = { 58, 21, 85, 95, 1, 27, 54, 67, 7 };

		int sum = 0;

		if (n % 2 == 0) {
			for (int i = 0; i <= n; i = i + 2) {
				sum += i;
			}
			System.out.println("Sum Of Even Number " + sum);
		} else {
			for (int i = 1; i <= n; i = i + 2) {
				sum += i;
			}
			System.out.println("Sum Of Odd Number " + sum);
		}

	}
}

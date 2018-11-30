package com.mavis;

import java.util.Scanner;

public class Ackermann {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please type in two number that you want to count :");
		System.out.println("a & b > 0");
		System.out.print("a = ");
		int a = scanner.nextInt();
		System.out.print("b = ");
		int b = scanner.nextInt();
		int c = 0;
		if(a > 0 || b > 0) {
		c = c + Ackermann(a, b);
		System.out.print(c);
		}
	}

	private static int Ackermann(int a, int b) {
		while (a != 0) {
			if (a > 0 && b == 0) {
				return Ackermann(a - 1, 1);
			} else {
				return Ackermann(a - 1, Ackermann(a, b - 1));
			}
		}

		return b + 1;
	}

}

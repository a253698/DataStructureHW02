package com.mavis;

import java.util.Scanner;

public class Ackermann {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please type in two number that you want to count :");
		System.out.print("a = ");
		int a = scanner.nextInt();
		System.out.print("b = ");
		int b = scanner.nextInt();

		System.out.print(Ackermann(a, b));
		
	}

	private static int Ackermann(int a, int b) {
		if (a == 0)
			return b + 1;
		else if (a > 0 && b == 0)
			return Ackermann(a - 1, 1);
		else
			return Ackermann(a - 1, Ackermann(a, b - 1));
	}

}

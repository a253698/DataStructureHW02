package com.mavis;

import java.util.Scanner;

public class FibonacciNumbers {

	public static void main(String[] args) {

		int a = 0;
		int b = 1;
		int c;
		int d;

		System.out.println("Count Fibonacci numbers n in f(n).");
		System.out.println("NOTICE : !! << n > 1 >> !!");
		System.out.println("Please type in the number you want to count : ");

		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		int e = Integer.parseInt(s);

		System.out.print(a + " " + b);// printing 0 and 1

		for (d = 2; d < e; d++)// loop starts from 2 because 0 and 1 are already printed
		{
			c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;
		}

	}

	/*
	 * int a = 0; int b = 1; int c ; int e = 0 ;
	 * 
	 * System.out.println("Count Fibonacci numbers n in f(n).");
	 * System.out.println("Please type in the number you want to count : ");
	 * 
	 * Scanner scanner = new Scanner(System.in); String s = scanner.nextLine(); int
	 * d = Integer.parseInt(s);
	 * 
	 * System.out.print("f(" + d + ") = " + a + "+" + b + "+" ); for(c = 2 ; c < d ;
	 * c++) { System.out.print(c + "+"); }
	 * 
	 * System.out.print(d); System.out.println(" ");
	 * 
	 * e = a + b ; for(c = 2 ; c <= d ; c++) { e = e + c ; }
	 * 
	 * System.out.print("f(" + d + ") = " + e) ;
	 * 
	 */ }

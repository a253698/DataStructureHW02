package com.mavis;

public class SSubset {

	public static void main(String[] args) {

		int set[] = { 1, 2, 3, 4, 5 };
		System.out.print("S : { ");
		for (int n = 0; n < set.length; n++) {
			System.out.print(set[n] + " ");
		}
		System.out.print("}");
		System.out.println(" ");
		printSubsets(set);
	}

	static void printSubsets(int[] set) {
		// print subset
		for (int i = 0; i < (1 << set.length); i++) {
			System.out.print("{ ");
			for (int j = 0; j < set.length; j++) {
				if ((i & (1 << j)) > 0) {
					System.out.print(set[j] + " ");
				}
			}
			// (1<<j) 1 move left
			// & two same = true
			System.out.println("}");
		}
	}

}

/*
 * 000 -> Empty set 
 * 001 -> a 
 * 010 -> b 
 * 011 -> ab 
 * 100 -> c 
 * 101 -> ac 
 * 110 -> bc 
 * 111 -> abc
 */

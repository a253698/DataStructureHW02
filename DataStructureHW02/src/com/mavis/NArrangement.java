package com.mavis;

import java.util.Random;

public class NArrangement {

	public static void main(String[] args) {
		
		int[] number = new int[10];
		
		for (int n = 0; n < number.length; n++) {
			number[n] = n;
		}
		
		System.out.print("before : ");
		
		for (int n = 0 ; n < number.length; n++) {
			System.out.print(number[n] +  " ");
		}
		
		System.out.println(" ");
		System.out.print("after : ");
		
		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			int j = r.nextInt(9);
			int tmp = number[i];
			number[i] = number[j];
			number[j] = tmp;
		}
		
		for (int n = 0 ; n < number.length; n++) {
			System.out.print(number[n] + " ");
		}
		
	}
}

package com.mavis;

import java.util.Scanner;

public class HighestCommonFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		 
        System.out.println("Please type in two number that you want to count :"); 
        System.out.print("a = "); 
        int a = scanner.nextInt();
        System.out.print("b = "); 
        int b = scanner.nextInt();
        System.out.println("The Highest Common Factor is : " + hcf(a, b)); 
		
	}
	
	private static int hcf(int a, int b) { 
       int ans = 1;
       while(a % b != 0) {
    	   ans = b;
    	   b = a % b ;
    	   a = ans ;		
       }
       
       ans = b ;
       return ans;
       
    } 

}

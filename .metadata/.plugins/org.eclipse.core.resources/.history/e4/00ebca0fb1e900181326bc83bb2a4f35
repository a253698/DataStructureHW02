package com.mavis;

import java.util.Scanner;

public class Combination {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Please type in two number that you want to count :"); 
        System.out.print("a = "); 
        int a = scanner.nextInt();
        System.out.print("b = "); 
        int b = scanner.nextInt();
        
        System.out.println(count(a,b)); 
	}
	
	private static int temp(int ans) { 
	      if(ans == 1) {
	    	  return ans;
	      }else {
	    	  return ans*temp(ans-1);
	      }
	    } 
	
	private static int count(int a , int b) { 
	      return temp(a) / (temp (b) * temp(a-b));
	    } 

}

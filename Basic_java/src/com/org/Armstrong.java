package com.org;

import java.util.*;

public class Armstrong {
	public static int count(int x ) {
		int i = 0;
		while(x!=0) {
			x = x/10;
			i++;
		}
		return i;
	}
	public static void main(String[] args) {
		

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number to check it's Amstrong or not");
			int n = sc.nextInt();
			int result = 0;
			int og = n;
			
			
		    

			while (og != 0) {
				int remainder = og % 10;
				result += Math.pow(remainder, count(n));
				og /= 10;
				
				
			}

			if (n == result) {
				System.out.println("Armstrong Number");
			} else {
				System.out.println("Not an Armstrong Number");
				
			}
			System.out.println("");
		}

	
}

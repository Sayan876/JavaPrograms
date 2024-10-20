package com.org;
import java.util.*;
public class PrimeNumber {
	
	public static boolean isPrime(int num) {
		boolean flag = false;
		
		if(num == 0 || num == 1) {
			flag = true;
		}
		
		for(int i = 2 ;i<num/2;i++) {
			if(num%2==0) {
				flag = true;
				break;
			}
		}
		
		if(flag) {
			return true;
		}else {
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check Prime or Not: ");
		int x = sc.nextInt();
		boolean result = isPrime(x);
		if(result) {
			System.out.println("Not a Prime Number");
		}else {
			System.out.println("Prime Number");
		}
	}

}

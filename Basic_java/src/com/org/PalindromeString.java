package com.org;
import java.util.*;
public class PalindromeString {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String to check that's palindrome or not");
		String word = sc.next().toLowerCase();
		
		String reversed = "";
		for(int i = 0; i<word.length(); i++) {
			reversed = word.charAt(i) + reversed;
		}
		
		if(word.equals(reversed)) {
			System.out.println("Given String is a Palindrome");
		}else {
			System.out.println("Given String is not a Palindrome");
		}
		
		
	}
}

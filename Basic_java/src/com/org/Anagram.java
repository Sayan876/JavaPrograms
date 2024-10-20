package com.org;
import java.util.*;
public class Anagram {
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the First Word");
	String str1 = sc.next().toLowerCase();
	System.out.println("Enter the Second anagram");
	String str2 = sc.next().toLowerCase();
	
	
	if(str1.length()==str2.length()) {
		char[] st1 = str1.toCharArray();
		char[] st2 = str2.toCharArray();
		
		Arrays.sort(st1);
		Arrays.sort(st2);
		
		boolean result = Arrays.equals(st1, st2);
		if(result) {
			System.out.println("Strings are Anagram");
			
		}else {
			System.out.println("not anagram");
		}
		
	}else {
		System.out.println("Lengths are different");
	}
	
	
}
}

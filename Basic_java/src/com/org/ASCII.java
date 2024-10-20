package com.org;

public class ASCII {
	public static void main(String[] args) {
		char number = 65 +1;
		System.out.println(number);
		
		for (int i = 0; i <26; i++) {
			number=(char) (number+i);

			System.out.println(number);
		}
	}
}

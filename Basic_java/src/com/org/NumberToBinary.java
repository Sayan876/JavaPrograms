package com.org;

import java.util.Scanner;

public class NumberToBinary {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		String binary = Integer.toBinaryString(number);
		System.out.println(binary);
	}
}

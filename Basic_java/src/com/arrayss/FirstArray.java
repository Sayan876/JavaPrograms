package com.arrayss;

import java.util.*;
public class FirstArray {
	
	
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Declare your Array size:");
    	int sum = 0;
    	int x = sc.nextInt();
		System.out.println("Now Enter the numbers");
    	int[] newArray = new int[x];
    	
    	for(int i=0; i<x;i++) {
    		newArray[i]=sc.nextInt();
    	}
    	
    	System.out.println("That array you created");
    	for(int i=0;i<x;i++) {
    		System.out.println(newArray[i]);
    	}
    	
    	System.out.println("In Reversed form");
    	for(int j=x-1; j>=0;j--) //This will print the array in reverse
    	{
    		System.out.println(newArray[j]);
    	}
    	
    	System.out.println("Sum of Array elements");
    	
    	for(int i = 0; i<x;i++) {
    		sum = sum + newArray[i];
    	}
    	
    	System.out.println("Result "+sum);
	}
}

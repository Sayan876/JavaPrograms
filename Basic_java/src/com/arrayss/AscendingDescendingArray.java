package com.arrayss;

public class AscendingDescendingArray {
   public static void main(String[] args) {
	int[] numbers = {10,50,34,7,99};
	int temp = 0;
	System.out.println("Size of the Array "+numbers.length);
	
	System.out.println("Array in Ascending Order");
	for(int i = 0; i< numbers.length;i++) {
		for(int j =i+1; j<numbers.length;j++) {
			if(numbers[i]>numbers[j]) {
				temp = numbers[i];
				numbers[i]=numbers[j];
				numbers[j]=temp;
			}
		}
	}
	
	for(int k = 0; k<numbers.length;k++) {
		System.out.println(numbers[k]);
	}
	
	System.out.println("Array in descending Order");
	for(int i = 0; i< numbers.length;i++) {
		for(int j =i+1; j<numbers.length;j++) {
			if(numbers[i]<numbers[j]) {
				temp = numbers[i];
				numbers[i]=numbers[j];
				numbers[j]=temp;
			}
		}
	}
	
	for(int k = 0; k<numbers.length;k++) {
		System.out.println(numbers[k]);
	}
}
}

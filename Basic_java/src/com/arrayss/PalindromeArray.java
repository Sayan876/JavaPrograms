package com.arrayss;

public class PalindromeArray {
   public static boolean isPalidndrome(int[] arr) {
	   int left = 0;
	   int right = arr.length-1;
	   
	   while(left<right) {
		   if(arr[left]!=arr[right]) {
			   return false;
		   }
		   left++;
		   right--;
	   }
	   return true;
   }
   
   public static void main(String[] args) {
	int[] nums = {10,20,30,30,30,20,10};
	System.out.println(nums.length);
	
	boolean result = isPalidndrome(nums);
	if(result) {
		System.out.println("Array is Palindrome");
	}else {
		
		System.out.println("Not a Palindrome");
	}
}
}

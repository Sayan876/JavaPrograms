package com.strings;

public class WordOccurance {
   public static void main(String[] args) {
	String sent = "Spring is beautiful but so is winter";
	String word = "is";
	String[] temp = sent.split(" ");
	int count = 0;
	
	for(int i = 0; i<temp.length;i++) {
		if (word.equals(temp[i]))
			count++;
			}
	
	System.out.println(count);
	}
}


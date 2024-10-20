package com.strings;

public class StringBuildOccur {
	
	public static String compressingString(String str) {
		StringBuilder sb = new StringBuilder();
		int count = 1;
		for(int i = 0; i<str.length();i++) {
			if(i+1<str.length() && str.charAt(i)==str.charAt(i+1)) {
				count++;
			}else {
				sb.append(str.charAt(i));
				sb.append(count);
				count = 1;
			}
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		String input = "AAABBBBBZZ";
		String result = compressingString(input);
		System.out.println(result);
	}

}

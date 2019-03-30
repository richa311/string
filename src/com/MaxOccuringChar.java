package com;

public class MaxOccuringChar {
	
	public static final int ascii = 256;
	public static char getMaxOcuuringChar(String str) {
		int count[] = new int[ascii];
		int len = str.length();
		for(int i = 0; i <len; i++) {
			count[str.charAt(i)]++;
		}
		int max = -1;
		char result = ' ';
		for(int i = 0; i < len; i++) {
			if (max < count[str.charAt(i)]) {
				max = count[str.charAt(i)];
				result = str.charAt(i);
			}
		}
		return result;
	}
	public static void main(String[] args) {
		String str = "Sample String";
		System.out.println("Max occuring character is " + getMaxOcuuringChar(str));
	}

}

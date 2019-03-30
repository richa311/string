package com;

public class TitleCase {

	public static void main(String[] args) {
		firstLetterCap("java brains");
	}
	
	public static void firstLetterCap(String s) {
		StringBuffer sb = new StringBuffer();
		sb.append(Character.toUpperCase(s.charAt(0)));
		for(int i = 1;i<s.length();i++) {
			if(s.charAt(i)== ' ') {
				sb.append(" ");
				sb.append(Character.toUpperCase(s.charAt(i+1)));
				i++;
			} else
				sb.append(s.charAt(i));
		 }
		System.out.println(sb.toString());
	}
}

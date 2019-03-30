package com;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String A=sc.next();
		int len = A.length()-1;
		boolean flag = true;
		int i=0;
		while(i<=(A.length()/2)){
			if(A.charAt(i)!=A.charAt(len)){
				flag=false;
				break;
			}
			i++;
			len--;
		}
		if(flag)
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}

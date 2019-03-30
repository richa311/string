package com;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class SubStringCompare {
	
	public static String getSmallestAndLargest(String s, int k) {
		String smallest = "";
		String largest = "";

		SortedSet<String> sets = new TreeSet<String>();
		for(int i = 0;i<s.length()-k;i++){
			sets.add(s.substring(i,i+k));
		}
		smallest = (String)sets.first();
		largest = (String)sets.last();
		return smallest + "\n" + largest;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int k = scan.nextInt();
		scan.close();

		System.out.println(getSmallestAndLargest(s, k));
	}
}

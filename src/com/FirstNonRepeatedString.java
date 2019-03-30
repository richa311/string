package com;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatedString {

	public static void main(String[] args) {
		System.out.println(firstNonrepeated("java"));
	}

	public static Character firstNonrepeated(String s) {
		char[] characters = s.toCharArray();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();

		for (Character ch : characters) {
			if (charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch) + 1);
			} else {
				charMap.put(ch, 1);
			}
		}
		for (Entry<Character,Integer> entry : charMap.entrySet()) {
			if (entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		return null;
	}
}

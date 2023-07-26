package com.stringPrograms;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class PrintPositionOfCharacterWithOutDuplicatesUsingMap {

	public static void main(String[] args) {
		String st = "kaNnada";
		String s = st.toLowerCase();
		LinkedHashMap<Character, Object> lm = new LinkedHashMap<Character, Object>();
		for (int i = 0; i < s.length(); i++) {
			lm.put(s.charAt(i), i);
		}
		for (Entry<Character, Object> m : lm.entrySet()) {
			for (int i = 0; i < s.length(); i++) {
				if (m.getKey() == s.charAt(i)) {
					System.out.println(m.getKey() + " is ar " + (i + 1));
					break;
				}
			}
		}
	}

}

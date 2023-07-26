package com.stringPrograms;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class PositionOfEachWordInAString {
public static void main(String[] args) {
	String st="I am a sdet engineer";
	String [] s= st.split(" ");
	LinkedHashMap<String, Integer> lh = new LinkedHashMap<String, Integer>();
	for(int i=0;i<s.length;i++) {
		lh.put(s[i], i);
	}
	for(Entry<String, Integer> m:lh.entrySet()) {
		for (int i = 0; i < s.length; i++) {
			if (m.getKey() == s[i]) {
				System.out.println(m.getKey() + " is at " + (i + 1));
				break;
			}
		}
	}
	
	
	
}
}

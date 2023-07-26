package com.stringPrograms;

import java.util.LinkedHashSet;

public class PrintOccurenceOfEachCharecter {
public static void main(String[] args) {
	String s= "kannada";
	LinkedHashSet<Character> lh= new LinkedHashSet<Character>();
	for(int i=0;i<s.length();i++) {
		lh.add(s.charAt(i));
	}
	for(Character c:lh) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(c==s.charAt(i)) {
				count++;
			}
		}
		System.out.println(c+" is repeating "+count);
	}
}
}

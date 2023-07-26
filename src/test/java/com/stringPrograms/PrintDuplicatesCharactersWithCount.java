package com.stringPrograms;

import java.util.LinkedHashSet;

public class PrintDuplicatesCharactersWithCount {
	public static void main(String[] args) {
		String s= "kannada";
		LinkedHashSet<Character> lh = new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
			lh.add(s.charAt(i));
		}
		for(Character ch: lh) {
			int count=0;
			for(int i=0;i<s.length();i++) {
				if(ch==s.charAt(i)) {
					count++;
				}
			}
			if(count>1) {
				System.out.println(ch+" is repeating "+count);
			}
		}
	}

}

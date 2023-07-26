package com.stringPrograms;

import java.util.LinkedHashSet;

public class PrintPositionInReverseOrder {
	public static void main(String[] args) {
		String s="kannada";
		LinkedHashSet<Character> lh = new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
			lh.add(s.charAt(i));
		}
		for(Character ch:lh) {
			for(int i=s.length()-1;i>=0;i--) {
				if(ch==s.charAt(i)) {
					System.out.println(s.charAt(i)+" is in "+(i+1)+" Position");
					break;
				}
			}
		}
		
		
	}

}

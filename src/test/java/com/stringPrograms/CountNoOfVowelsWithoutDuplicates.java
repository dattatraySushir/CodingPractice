package com.stringPrograms;

import java.util.LinkedHashSet;

public class CountNoOfVowelsWithoutDuplicates {

	public static void main(String[] args) {
		String st="India";
		String b="aeiou";
		String s=st.toLowerCase();
		LinkedHashSet<Character> lh = new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
			lh.add(s.charAt(i));
		}
		int count =0;
		for(Character ch:lh) {
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				count++;
				System.out.print(ch);
			}
		
		}
		System.out.print("="+count);

	}

}

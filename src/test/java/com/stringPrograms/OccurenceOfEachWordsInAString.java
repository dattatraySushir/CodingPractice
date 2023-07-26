package com.stringPrograms;

import java.util.LinkedHashSet;

public class OccurenceOfEachWordsInAString {
	public static void main(String[] args) {
		String st="I am a  am sdet engineer";
		String [] s= st.split("\\s+");
		LinkedHashSet<String> lh = new LinkedHashSet<String>();
		for(int i=0;i<s.length;i++) {
			lh.add(s[i]);
		}
		for(String str:lh) {
			int count=0;
			for(int i=0;i<s.length;i++) {
				if(str.equals(s[i])) {
					count++;
				}
			}
			System.out.println(str+" is occuring "+count);
		}
	}

}

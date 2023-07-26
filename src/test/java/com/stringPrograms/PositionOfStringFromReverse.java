package com.stringPrograms;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class PositionOfStringFromReverse {

	public static void main(String[] args) {
		String st="I am a sdet engineer";
		String [] s= st.split(" ");
		LinkedHashMap<String,Integer> lm= new LinkedHashMap<String, Integer>();
		for(int i=0;i<s.length;i++) {
			lm.put(s[i],i);
		}
		for(Entry<String, Integer> str:lm.entrySet()) {
			for(int i=0;i<s.length;i++) {
				for (int j=s.length-1;j>=0;j--) {
					
					
				}
			}
		}

	}

}

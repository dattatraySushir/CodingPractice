package com.stringPrograms;

import java.util.LinkedHashSet;

public class PositionFromReverseOrderOfString {
public static void main(String[] args) {
	String st= "I am a a am engineer sdet engineer";
	String [] s=st.split("\\s+");
	LinkedHashSet<String> ls = new LinkedHashSet<String>();
	for(int i=0;i<s.length;i++) {
		ls.add(s[i]);
	}
	for(String str:ls) {
		for(int i=s.length-1;i>=0;i--) {
			if(str.equals(s[i])) {
				System.out.println(s[i]+" is at position "+(i+1));
				break;
			}
		}
	}
	
	
	
}
}

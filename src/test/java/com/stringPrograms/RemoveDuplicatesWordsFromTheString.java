package com.stringPrograms;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class RemoveDuplicatesWordsFromTheString {
public static void main(String[] args) {
	String st="I am a am a sdet engineer";
	String [] s= st.split(" ");
/*	boolean flag =false;
	for(int i=0;i<s.length;i++) {
		for(int j=i+1;j<s.length;j++) {
			if(s[i].equals(s[j])) {
				flag=true;
				break;
			}
		}
		if(flag=false) {
			System.out.println(s[i]);
		}
	}
*/	
	LinkedHashSet<String> lh = new LinkedHashSet<String>();
	for(int i=0;i<s.length;i++) {
		lh.add(s[i]);
	}
	for(String str:lh) {
		System.out.print(str+" ");
	}
	
	
}
}

package com.stringPrograms;

public class Swap1StAndLastWordInAString {
public static void main(String[] args) {
	String str="I am a sdet engineer";
	String[] s=str.split(" ");
	String  temp=s[0];
	s[0]=s[s.length-1];
	s[s.length-1]=temp;
	
	for(int i=0;i<s.length;i++) {
		System.out.println(s[i]);
		
	}
}
}

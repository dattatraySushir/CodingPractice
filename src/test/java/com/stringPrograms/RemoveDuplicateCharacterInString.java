package com.stringPrograms;

public class RemoveDuplicateCharacterInString {
public static void main(String[] args) {
	String s="Testing";
	int l=s.length();
	String str="";
	char[] ch=s.toCharArray();
	for (int i=0;i<l;i++) {
		for (int j=1;j<l;j++) {
			if(ch[i]==ch[j]) {
				str=str+ch[j];
			}
		}		
	}
	String d=s.replace(str, "");
	System.out.println(d);
	
	
	
	
}
}

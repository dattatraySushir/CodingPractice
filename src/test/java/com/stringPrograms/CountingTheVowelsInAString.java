package com.stringPrograms;

public class CountingTheVowelsInAString {
	public static void main(String[] args) {
		String s="India";
		String str=s.toLowerCase();
		String a="aeiou";
		
		for(int i=0;i<str.length();i++) {
			int count=0;
			for(int j=0;j<a.length();j++) {
				if(str.charAt(i)==a.charAt(j)) {
					count++;
					break;
				}
				
			}
			if(count>1) {
			System.out.println(str.charAt(i)+" "+count);
		}
			}
		
		
	}

}

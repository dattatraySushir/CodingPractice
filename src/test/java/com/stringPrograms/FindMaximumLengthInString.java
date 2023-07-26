package com.stringPrograms;

public class FindMaximumLengthInString {
	public static void main(String[] args) {
		String [] s= {"ab","abc","bd","abcd","abcde"};
		String maxLength=s[0];
		for(int i=0;i<s.length;i++) {
			if(s[i].length()>maxLength.length()) {
				maxLength=s[i];
			}
		}
		for(int i=0;i<s.length;i++) {
			if(s[i].length()==maxLength.length()) {
				System.out.println(s[i]+" ");
			}
		}		
	}

}

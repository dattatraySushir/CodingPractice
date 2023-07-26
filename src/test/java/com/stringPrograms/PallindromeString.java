package com.stringPrograms;

public class PallindromeString {
	public static void main(String[] args) {
		String s= "nayan";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		if(rev.equals(s)) {
			System.out.println("The string is palindrome");
		}
		else {
			System.out.println("The string is not a palindrome");
		}
		
		
	}

}

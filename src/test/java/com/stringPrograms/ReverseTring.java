package com.stringPrograms;

public class ReverseTring {
	public static void main(String[] args) {
		
		//approach 1
		String str="software";
		String str1="";
		int l=str.length()-1;
		for(int i=l;i>=0;i--) {
			char ch=str.charAt(i);
			str1=str1+ch;
		}
		System.out.println(str1);
		
		//approach 2
		StringBuilder st = new StringBuilder("software");
		System.out.println(st.reverse());
		
		
		//approach 3
		char []ch = str.toCharArray();
		int count =0;
		for(char c:ch) {
			count++;
		}
		for(int i=count-1;i>=0;i--) {
			System.out.print(ch[i]);
		}
		System.out.println();
		
		//approach 4
		char ch1 []=str.toCharArray();
		for(int i=ch1.length-1;i>=0;i--) {
			System.out.print(ch1[i]);
		}
		System.out.println();
		
		//approach 5
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
	}

}

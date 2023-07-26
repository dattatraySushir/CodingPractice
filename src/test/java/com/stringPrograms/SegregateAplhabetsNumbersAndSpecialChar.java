package com.stringPrograms;

public class SegregateAplhabetsNumbersAndSpecialChar {
	public static void main(String[] args) {
		String st="1b2%a3(t";
		String s=st.toLowerCase();
		String num="";
		String alpha="";
		String spc="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9') {
				num=num+ch;
			}
			else if(ch>='a' && ch<='z') {
				alpha=alpha+ch;
			}
			else {
				spc=spc+ch;
			}
		}
		System.out.println(num+" "+alpha+" "+spc);
	}

}

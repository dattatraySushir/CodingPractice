package com.assignmentPractice;

public class VowelsOcuurenece {
public static void main(String[] args) {
	String pt="Prathamesh";
	String p=pt.toLowerCase();
	String d="aeiou";
	
	for(int i=0;i<p.length();i++) {
		int count=0;
		for(int j=0;j<d.length();j++) {
			
			if(p.charAt(i)==d.charAt(j)) {
				count++;
				break;		
			}
		}
		if (count>0) {
			System.out.println(p.charAt(i)+" = "+count);
		}
		
	}
	
	
	
}
}

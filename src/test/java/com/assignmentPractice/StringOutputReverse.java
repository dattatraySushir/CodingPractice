package com.assignmentPractice;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class StringOutputReverse {
	public static void main(String[] args) throws Throwable {
		String st="i am sdet engineer";
		//o/p=  r ee n igne tedsaami
		String[] s=st.split(" ");
		String  d = "";
		LinkedList<Integer> al= new LinkedList<Integer>();
			for(int i=0;i<st.length();i++) {
				if(st.charAt(i)==' ') {
					al.add(i);
				}
			}
			//System.out.println(al.size());
			for(int i=0;i<s.length;i++) {
				 d=s[i];
			for(int j=d.length();j>=0;j--) {
				System.out.print(d.charAt(i));
							
			}
			}
			
			ArrayList<Character> alc= new ArrayList<Character>();
			for(int i=0;i<d.length();i++) {
				alc.add(d.charAt(i));
			}
			
			for(int j=0;j<al.size();j++) {
				alc.add(al.get(j),' ');
				//System.out.println(j);
			}
		
		//System.out.println(alc);
		
	}

}

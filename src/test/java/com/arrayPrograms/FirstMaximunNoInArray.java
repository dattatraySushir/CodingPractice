package com.arrayPrograms;

public class FirstMaximunNoInArray {
	public static void main(String[] args) {
		
	
	int[] a = { 5, 2, 1, 7, 4 };
	int max=a[0];
	for(int i=0;i<a.length;i++) {
		
			if(a[i]>max) {
				max=a[i];
				break;
			
		}
	}
	System.out.println(max);
	
	
	
	}
}

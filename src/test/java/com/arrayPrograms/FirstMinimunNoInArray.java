package com.arrayPrograms;

public class FirstMinimunNoInArray {
	public static void main(String[] args) {
		
	
	int[] a = { 5, 2, 1, 7, 4 };
	int min=a[0];
	
	for(int i=0;i<a.length;i++) {
		//for(int j=i+1;j<a.length;j++) {
			if(a[i]<min) {
				min=a[i];
				//break;
			//}
		}
		
	}
	System.out.println(min);
}}

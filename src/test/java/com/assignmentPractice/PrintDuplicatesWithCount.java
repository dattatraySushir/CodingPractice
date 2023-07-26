package com.assignmentPractice;

public class PrintDuplicatesWithCount {
public static void main(String[] args) {
	int[] a = { 5, 3, 1, 1, 2, 5, 6 };
	for (int i = 0; i < a.length; i++) {
		for (int j = i + 1; j < a.length; j++) {
			if (a[i] == a[j]) {
				
			}				
		}
	}
	for(int i=0;i<a.length;i++) {
		if(a[i]!=1) {
			System.out.print(a[i]+" ");
		}
	}
	
	
}
}

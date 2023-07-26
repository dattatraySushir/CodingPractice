package com.assignmentPractice;

public class ERemoveDuplicatesFromArray {
	public static void main(String[] args) {
		int[] a = { -1,-1,5, 3, 1, 1, 2, 5, 6 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					a[j]=' ';
				}				
			}
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]!=' ') {
				System.out.print(a[i]+" ");
			}
		}
	}
}

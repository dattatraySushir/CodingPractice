package com.stringPrograms;

import java.util.LinkedHashSet;

public class PrintDuplicatesWithCount {
public static void main(String[] args) {
	int[] a = { 5, 3, 1, 1, 2, 5, 6 };
	LinkedHashSet<Integer> lh = new LinkedHashSet<Integer>();
	for(int i=0;i<a.length;i++) {
		lh.add(a[i]);
	}
	for(Integer ch: lh) {
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(ch==a[i]) {
				count++;
			}
		}
		if(count>1) {
			System.out.println(ch+" is repeating "+count);
		}
	}
	}
	
	

}

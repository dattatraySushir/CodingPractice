package com.arrayPrograms;

public class SecondMinimumNoInArray {
public static void main(String[] args) {
	int[] a = { 5, 2, 1, 7, 4 };
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]<a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		System.out.println(a[1]);
	}
}
}

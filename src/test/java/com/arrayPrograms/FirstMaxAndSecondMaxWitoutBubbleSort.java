package com.arrayPrograms;

public class FirstMaxAndSecondMaxWitoutBubbleSort {

	public static void main(String[] args) {
		int[] a = { 0, 5, 2, 0, 1 };
		int fmax = a[0];
		int smax = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > fmax) {
				if (a[i] != fmax) {
					smax = fmax;
				}
				fmax = a[i];
			} else if (a[i] > smax || fmax == smax) {
				smax = a[i];
			}
		}
		System.out.println("The First maximum no. is: "+fmax);
		System.out.println("The second Maximum no is : "+smax);

	}

}

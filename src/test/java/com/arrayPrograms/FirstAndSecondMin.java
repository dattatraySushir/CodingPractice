package com.arrayPrograms;

public class FirstAndSecondMin {

	public static void main(String[] args) {
		int[] a = { 0, 5, 2, 0, 1};
		int fmin = a[0];
		int smin = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < fmin) {
				if (a[i] != fmin) {
					smin = fmin;
				}
				fmin = a[i];
			} else if (a[i] < smin || smin == fmin) {
				smin = a[i];
			}
		}
		System.out.println("The first minimum no is: "+fmin);
		System.out.println("The second minimum no. is "+smin);
	}

}

package com.assignmentPractice;

public class SumOfFirstAnd3rdMinimumNoWithoutBubbleSort {
	public static void main(String[] args) {
		int[] a = { 10, 50, 20, 8, 80, 25 };
		// int [] b= new int [a.length];
		int fmin = a[0];
		int smin = a[0];
		int tmin = a[0];
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] <= fmin) {
				if (a[i] != fmin) {
					tmin = smin;
					smin = fmin;
				}
				fmin = a[i];
			} else if (a[i] <= smin || fmin == smin) {
				smin = a[i];
			}
			else if (a[i] <= tmin || smin == tmin || fmin == tmin) {
				tmin = a[i];
			}
		}
		int sum = 0;
		sum = fmin + smin + tmin;
		System.out.println("The sum of the first and third minimum is :" + sum);
	}

}

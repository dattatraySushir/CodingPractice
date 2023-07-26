package com.assignmentPractice;

//sumof three min no.
public class Sumofthreeminno {
	public static void main(String[] args) {
		int a[] = { 1, 3, 2, 8, 2, 14 };
		int fmin = a[0];
		int smin = a[0];
		int tmin = a[0];
		int sum = 0;
		for (int i = 0; i < a.length; i++) {

			if (a[i] < fmin) {
				if (a[i] != fmin) {
					tmin = smin;
					smin = fmin;
				}
				fmin = a[i];
			} else if (a[i] <= smin || fmin == smin) {
				if (a[i] < smin) {
					tmin = smin;
				}
				smin = a[i];
			} else if (a[i] < tmin || tmin == smin || fmin == tmin) {

				tmin = a[i];
			}

		}
		sum = fmin + smin + tmin;
		System.out.println(fmin);
		System.out.println(smin);
		System.out.println(tmin);
		// System.out.println(sum);
	}

}

package com.classAssignment;

public class PrimeNoInAnArray {
	public static void main(String[] args) {
		int a[] = { 1, 3, 2, 4, 5, 7 };

		for (int j = 0; j < a.length ; j++) {
			int b = a[j];
			int count = 0;
			for (int i = 1; i <= b; i++) {
				if (a[j] % i == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(a[j] + " is a prime number");
			} else {
				System.err.println(a[j] + " is not a prime no.");
			}
		}
	}

}

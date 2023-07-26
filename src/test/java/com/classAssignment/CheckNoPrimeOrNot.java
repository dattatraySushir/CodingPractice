package com.classAssignment;

public class CheckNoPrimeOrNot {
	public static void main(String[] args) {
		int num=7;
		int count=0;
		for (int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("The provided "+num+" is prime Number");
		}
		else {
			System.out.println("The provided "+num+" is not a prime number");
		}
		
		
	}

}

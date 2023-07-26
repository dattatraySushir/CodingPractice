package com.classAssignment;

public class PrintPrimeNos {
	public static void main(String[] args) {
		int num[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		for(int i=0;i<num.length;i++) {
			int b=num[i];
			int count=0;
			for(int j=1;j<=b/2;j++) {
				if(num[i]%j==0) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(num[i]+" is a prime number.");
			}
			
			else {
				System.err.println(num[i]+" is not a prime number.");
			}
		}
		
		
		
		
		/*
		 * int num=num1.length; for(int i=1;i<num;i++) { if(isPrime(num1[i])) {
		 * System.out.println("The provided "+num1[i]+" is a prime no."); } } } public
		 * static boolean isPrime(int num) { boolean flag = true; if(num==1) { return
		 * false; } for(int i=2;i<=num/2;i++) { if(num%i==0) { return false; } } return
		 * flag;
		 */
	}
		
		
	}



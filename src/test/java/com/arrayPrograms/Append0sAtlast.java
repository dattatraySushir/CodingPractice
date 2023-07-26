package com.arrayPrograms;

public class Append0sAtlast {

	public static void main(String[] args) {
		int a[]= {0,4,0,6,0,1};//4 6 1 0 0 0
		int[] b = new int [a.length];
		int m=0;
		int n=b.length-1;
		for(int i=0;i<a.length;i++) {
			
				if(a[i]!=0) {
					b[m]=a[i];
					m++;
				}
				else {
					b[n]=a[i];
					n--;
				}
				
		}
		for(int j=0;j<b.length;j++) {
			System.out.println(b[j]);
		}
				
		
	}

}

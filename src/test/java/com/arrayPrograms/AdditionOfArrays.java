 package com.arrayPrograms;

public class AdditionOfArrays {
public static void main(String[] args) {
	int [] a= {4,2,5,1,3};
	int [] b= {3,1,6,4};
	int length=a.length;
	if(a.length<b.length) {
		length=b.length;
	}
	for (int i=0;i<length;i++) {
		try {
	System.out.print(a[i]+b[i]+" ");
		}catch(Exception e) {
			if(a.length<b.length) {
				System.out.println(b[i]);
			}else {
				System.out.println(a[i]);
			}
		}
				
			
		
		
	}
	
}
}

package com.patternPrograms;

public class Pattern17 {
	public static void main(String[] args) {
		int count=1;
		for(int i=1;i<6;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(count+" ");
				count++;
				if(count>9) {
					count=1;
				}
			}
			
			System.out.println();
		}
		
		
	}

}

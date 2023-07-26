package com.collectionPrograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayProgram {

	
public static void main(String[] args) {
		ArrayList<Object> al= new ArrayList<Object>();
		al.add(10);
		al.add("Datta");
		al.add('S');
		al.add("");
		al.add(null);
		al.add("Datta");
		al.add('S');
		System.out.println(al);
		ArrayList<Integer> ai= new ArrayList<Integer>();
		ai.add(10);
		ai.add(50);
		ai.add(90);
		ai.add(0);
		ai.add(99);
		Collections.sort(ai);
		System.out.println(ai);
		al.add(ai);
		
		for(Object data:al) {
			System.out.println(data);
		}
	}
}

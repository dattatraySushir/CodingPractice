package com.collectionPrograms;
import java.util.LinkedList;
public class LinkedListConcept {
	public static void main(String[] args) {
		LinkedList<Object> ll= new java.util.LinkedList<Object>();
		ll.add("Datta");
		ll.add(10);
		ll.add('A');
		ll.add("hi");
		ll.add(null);
		ll.add(20);
		ll.add(9);
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		
		
		
	}

}

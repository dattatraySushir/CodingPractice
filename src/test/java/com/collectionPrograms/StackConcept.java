package com.collectionPrograms;

import java.util.Stack;

public class StackConcept {
public static void main(String[] args) {
	Stack<Object> s= new Stack<Object>();
	s.push(10);
	s.push(50);
	System.out.println(s.pop());
	System.out.println(s.pop());
}
}

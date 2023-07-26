package com.collectionPrograms;
import java.util.PriorityQueue;
public class PriorityQueueConcept {

	public static void main(String[] args) {
		PriorityQueue<Object> pq = new PriorityQueue<Object>();
		pq.add(20);
		pq.add("datta");
		pq.add('A');
		pq.add(null);
		pq.add(20);
		pq.add(null);
		System.out.println(pq);
	}
	
}

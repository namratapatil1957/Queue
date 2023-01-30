package com.bridgelabz.queue;
import java.util.*;

public class queue {

	int num;
	static List <Integer> list = new ArrayList(); 
	
	public static void main(String[] args) {
		
		queue q = new queue();
		
		q.enqueue();
		q.peek();
		q.dequeue();
		q.peek();
	}
	
	void enqueue() {
		
		list.add(56);
		list.add(30);
		list.add(70);
		System.out.println(" \n The queue is: " + list);
	}
	
	void peek() {
		
		int peek = list.get(0);
		System.out.println(" The element present at peek is " + peek);
	}
	
	void dequeue() {
		
		int remove = list.remove(0);
		System.out.println(" \n The dequeue element is " + remove);
		System.out.println(" \n The queue elements are " + list);
	}

}

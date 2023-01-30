package com.bridgelabz.queue;
import java.util.*;

public class queue {

	int num;
	static List <Integer> list = new ArrayList(); 
	
	public static void main(String[] args) {
		
		queue q = new queue();
		
		q.enqueue();
		
	}
	
	void enqueue() {
		
		list.add(56);
		list.add(30);
		list.add(70);
		System.out.println(" \n The queue is: " + list);
	}

}

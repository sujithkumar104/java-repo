package com.concepts.collections.custom.linkedList;

public class Runner {
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(20);
		list.insert(40);
		list.insert(60);
		list.insert(80);
		list.insertAtStart(100);
		list.insertAt(3, 55);
		
		list.deleteAt(4);
		
		list.show();
	}

}

package com.concepts.collections.custom.arrayList;

public class ArrayList {
	
	int capacity = 2;
	Object[] list = new Object[capacity];
	int top = 0;
	
	public void add(Object obj) {
		
		if(top == capacity) {
			expand();
		}
		list[top] = obj;
		top++;
	}
	
	public int size() {
		return top;
	}
	
	public void expand() {
		int length = list.length;
		capacity = capacity * 2;
		Object[] newList = new Object[capacity];
	    System.arraycopy(list, 0, newList, 0, length);
	    list = newList;
	}
	
	public void show() {
		for(Object obj: list) {
			System.out.println(obj);
		}
	}
	
	public void remove(int index) {
		final int newSize;
		int size=list.length;
        if ((newSize = size - 1) > index)
		System.arraycopy(list, index+1, list, index, newSize-index);
        list[size = newSize] = null;
	}

}

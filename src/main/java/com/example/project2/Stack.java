package com.example.project2;

public class Stack<T extends Comparable<T>> implements StackInterface<T>{
	CursorArray<T> ca = new CursorArray<>(2+20);
	int l = ca.createList();

	@Override
	public void push(T data) {
		if(!ca.insertAtHead(data, l))
			System.out.println("Error: Satck Overflow!!!!");
	}

	@Override
	public Comparable<T> pop() {
		return ca.deleteFirst(l);
	}

	@Override
	public Comparable<T> peek() {
		return ca.getFirst(l);
	}

	@Override
	public boolean isEmpty() {
		return ca.isEmpty(l);
	}

	@Override
	public void clear() {
		while(true){
			if(pop() == null)
				return;
		}
	}

}
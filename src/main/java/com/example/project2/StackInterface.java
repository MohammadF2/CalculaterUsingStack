package com.example.project2;

public interface StackInterface<T extends Comparable<T>> {

	public void push(T data);
	public Comparable<T> pop();
	public Comparable<T> peek();
	public boolean isEmpty();
	public void clear();

}

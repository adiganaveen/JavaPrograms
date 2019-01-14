
package com.bridgelabz.util;

public class Stack<T> {
	private T[] stackArray;
	private int top;
	private int size = 0;

	@SuppressWarnings("unchecked")
	public Stack() {
		stackArray = (T[]) new Object[1000];
		top = -1;
	}

	public void push(T j) {
		if (top == stackArray.length) {
			System.out.println("Stack full");
			size++;
		} else {
			stackArray[++top] = j;
			size++;
		}

	}

	public int size() {
		return size;
	}

	public T pop() {
		if (top == -1) {
			System.out.println("Underflow error");
			return null;
		} else {
			T element = stackArray[top--];
			return element;
		}
	}

	public T peek() {
		return stackArray[top];
	}

	public boolean isEmpty() {
		return (top == -1) ? true : false;
	}

}

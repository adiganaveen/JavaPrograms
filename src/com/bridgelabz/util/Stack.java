package com.bridgelabz.util;

public class Stack {
	private long[] stackArray;
	private int top;
	private int size=0;
	
	public Stack() {
		stackArray = new long[1000];
		top = -1;
	}

	public void push(long j) {
		if (top == stackArray.length) {
			System.out.println("Stack full");
			size++;
		} else {
			stackArray[++top] = j;
			size++;
		}
		
	}
 public int size()
 {
	 return size;
 }
	public long pop() {
		if (top == -1) {
			System.out.println("Underflow error");
			return '\0';
		} else {
			char element = (char) stackArray[top--];
			return element;
		}
	}

	public long peek() {
		return stackArray[top];
	}

	public boolean isEmpty() {
		return (top == -1) ? true : false;
	}

	public boolean isBalanced(char exp[]) {

		Stack st = new Stack();
		for (int i = 0; i < exp.length; i++) {
			if (exp[i] == '(')
				st.push(exp[i]);

			if (exp[i] == ')') {
				if (st.isEmpty()) {
					return false;
				}

				else if (!st.Pair((char) st.pop(), exp[i])) {
					return false;
				}
			}

		}

		if (st.isEmpty())
			return true;
		else
			return false;
	}

	public boolean Pair(char character1, char character2) {
		if (character1 == '(' && character2 == ')')
			return true;
		else
			return false;
	}
}

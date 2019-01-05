package com.bridgelabz.datastructuresprograms;

import com.bridgelabz.util.DataStructureUtility;
import com.bridgelabz.util.Deque;

public class Palindrome­Checker {
	public static void main(String[] args) {
		Deque deque = new Deque(100);
		System.out.println("Enter string to check to check it is palindrome or not");
		String str = DataStructureUtility.userString();
		str = str.toLowerCase();
		char[] ch = str.toCharArray();
		int flag = 0;
		for (int i = 0; i < ch.length; i++) {
			deque.addRear(ch[i]);
		}
		System.out.println(deque.size());
		while (deque.size() > 1) {
			if (deque.removeFront() != deque.removeRear()) {
				flag = 1;
			}
		}
		if (flag == 0) {
			System.out.println("it is a palindrome");
		} else {
			System.out.println("it is not a palindrome");
		}
	}
}

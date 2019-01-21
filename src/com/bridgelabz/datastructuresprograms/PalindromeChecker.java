/******************************************************************************
 *  Compilation:  javac -d bin PalindromeChecker.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprogram.PalindromeChecker n
 *  
 *  Purpose: A palindrome is a string that reads the same forward and backward.
 *  		 	To construct an algorithm to input a string of characters and 
 *  			check whether it is a palindrome.
 *
 *  @author  Naveen Adiga
 *  @version 1.0
 *  @since   2-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.datastructuresprograms;

import com.bridgelabz.util.DataStructureUtility;
import com.bridgelabz.util.Deque;

public class PalindromeChecker {
	/*
	* The main function is to read the input from the user
	* and checking whether the entered string is palindrome 
	* or not
	*/
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Deque<Comparable> deque = new Deque<Comparable>(100);
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

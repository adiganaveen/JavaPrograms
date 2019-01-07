/******************************************************************************
 *  Compilation:  javac -d bin PrimeAnagramOnStack.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprogram.PrimeAnagramOnStack n
 *  
 *  Purpose: Add the Prime Numbers that are Anagram in the Range of 0 � 1000 in 
 *  			a Stack using the Linked List and Print the Anagrams in the 
 *  			Reverse Order.
 *
 *  @author  Naveen Adiga
 *  @version 1.0
 *  @since   5-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.datastructuresprograms;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.DataStructureUtility;
import com.bridgelabz.util.Stack;

public class PrimeAnagramOnStack {
	/*
	* The main function is to print the 2 dimension representation
	* of the prime numbers from 0-1000 using stack
	*/
public static void main(String[] args) {
	Stack<Integer> stack=new Stack<Integer>();
	List<Integer> list2 = new ArrayList<Integer>();
	list2 = DataStructureUtility.findPrime(0,1000); //finding prime
	stack=DataStructureUtility.primeAnagram2(list2); //finding anagram
	System.out.println(stack.size()+" is the size of the stack");
	System.out.println("Printing the elements in reverse order using pop function of stack");
	while(!stack.isEmpty())
	{
		System.out.println(stack.pop()+" "+stack.pop());
	}
}
}

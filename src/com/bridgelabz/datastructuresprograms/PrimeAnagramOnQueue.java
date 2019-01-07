/******************************************************************************
 *  Compilation:  javac -d bin PrimeAnagramOnQueue.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprogram.PrimeAnagramOnQueue n
 *  
 *  Purpose: Add the Prime Numbers that are Anagram in the Range of 0 � 1000 
 *  			in a Queue using the Linked List and Print the Anagrams from 
 *  			the Queue.
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
import com.bridgelabz.util.Queue;

public class PrimeAnagramOnQueue {
	/*
	* The main function is to print the 2 dimension representation
	* of the prime numbers from 0-1000 using queue
	*/
	public static void main(String[] args) {
		Queue<Integer> queue=new Queue<Integer>(1000);
		List<Integer> list2 = new ArrayList<Integer>();
		list2 = DataStructureUtility.findPrime(0,1000); //finding prime
		queue = DataStructureUtility.primeAnagram3(list2); //finding anagram
		System.out.println(queue.size()+" is the size of queue");
		System.out.println("Elements in a queue are :");
		while(!queue.isQueueEmpty())
		{
			queue.dequeue();
			queue.dequeue();
			System.out.println();
		}
	}

}

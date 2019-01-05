package com.bridgelabz.datastructuresprograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.bridgelabz.util.DataStructureUtility;
import com.bridgelabz.util.Queue;

public class PrimeAnagramOnQueue {

	public static void main(String[] args) {
		Queue queue=new Queue(1000);
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

/******************************************************************************
 *  Compilation:  javac -d bin RangePrimeAnagram.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprogram.RangePrimeAnagram n
 *  
 *  Purpose: 2D Array the numbers that are Anagram and numbers that are not 
 *  			Anagram
 *
 *  @author  Naveen Adiga
 *  @version 1.0
 *  @since   4-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.datastructuresprograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import com.bridgelabz.util.DataStructureUtility;

public class RangePrimeAnagram {
	
	/*
	* The main function is to print the 2 dimension representation
	* of the prime numbers from 0-1000 that anagram and not anagram
	*/
	public static void main(String[] args) {
		List<List<Integer>> list1 = new ArrayList<List<Integer>>();
		List<Integer> list2 = new ArrayList<Integer>();
		List<Integer> list3 = new ArrayList<Integer>();
		Set<Integer> set = new HashSet<Integer>();
		list3 = DataStructureUtility.findPrime(0,1000);
		System.out.println("Total number of prime numbers are :"+list3.size());
		set = DataStructureUtility.primeAnagram(list3);
		list2.addAll(set);
		list1.add(list2);
		for (int i = 0; i < list2.size(); i++) {
			if (list3.contains(list2.get(i))) {
				list3.remove(list2.get(i));
			}
		}
		list1.add(list3);
		DataStructureUtility.printPrimeAndAnagram(list1);		
	}
}

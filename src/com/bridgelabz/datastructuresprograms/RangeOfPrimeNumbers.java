/******************************************************************************
 *  Compilation:  javac -d bin RangePrimeAnagram.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprogram.RangePrimeAnagram n
 *  
 *  Purpose: Store the prime numbers in a 2D Array, the first dimension 
 *  represents the range 0�100,100�200, and so on. While the second dimension 
 *  represents the prime numbers in that range
 *
 *  @author  Naveen Adiga
 *  @version 1.0
 *  @since   4-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.datastructuresprograms;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.util.DataStructureUtility;

public class RangeOfPrimeNumbers {
	/*
	* The main function is to print the 2 dimension representation
	* of the prime numbers from 0-1000
	*/
	public static void main(String[] args) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		List<Integer> list1 = new ArrayList<Integer>();
		int low = 0;
		int high = 100;

		for (int i = 0; i < 10; i++) {
			list1 = DataStructureUtility.findPrime(low, high);
			list.add(list1);
			low += 100;
			high += 100;
		}
//        System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			List<Integer> onlyPrime = list.get(i);
			for (int j = 0; j < onlyPrime.size(); j++) {
				System.out.print(onlyPrime.get(j) + " ");
			}
			System.out.println();
		}
	}

}

/******************************************************************************
 *  Compilation:  javac -d bin BubbleSort.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprogram.BubbleSort n
 *  
 *  Purpose: Sorts array of integers.
 *
 *  @author  Naveen Adiga
 *  @version 1.0
 *  @since   22-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.AlgorithmUtility;

public class BubbleSort {
	/*
	 * The main function is written to take input from the user and and call the
	 * bubbleSort function that sorts array of integers
	 */
	public static void main(String[] args) {
		System.out.println("enter the number of elements in an array");
		int num = AlgorithmUtility.userInteger();
		int[] arr = new int[num];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter " + i + "th element of an array");
			arr[i] = AlgorithmUtility.userInteger();
		}
		int[] newarr = AlgorithmUtility.bubbleSort(arr, arr.length);
		for (int i = 0; i < newarr.length; i++) {
			System.out.println(" sorted elements are");
			System.out.println(arr[i]);
		}
	}
}

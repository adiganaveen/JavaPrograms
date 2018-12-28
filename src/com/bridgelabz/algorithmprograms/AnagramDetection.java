/******************************************************************************
 *  Compilation:  javac -d bin AnagramDetection.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprogram.AnagramDetection n
 *  
 *  Purpose: Determines whether two strings are anagram.
 *
 *  @author  Naveen Adiga
 *  @version 1.0
 *  @since   21-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.AlgorithmUtility;

public class AnagramDetection {
	/*
	 * The main function is written to take input from the user and and call the
	 * isAnagram function that checks anagram of two strings
	 */
	public static void main(String[] args) {
		System.out.println("Enter the first string");
		String str1 = AlgorithmUtility.userString();
		System.out.println("Enter the second string");
		String str2 = AlgorithmUtility.userString();
		boolean b1 = AlgorithmUtility.anagramDetection(str1, str2);
		System.out.println();
		if (b1 == true) {
			System.out.println("the given two strings " + str1 + " and " + str2 + " are anagram");
		} else
			System.out.println("the given two strings " + str1 + " and " + str2 + " are not an anagram");
	}
}

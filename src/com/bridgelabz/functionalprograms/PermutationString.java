/******************************************************************************
 *  Compilation:  javac -d bin PermutationString.java
 *  Execution:    java -cp bin package com.bridgelabz.functionalprograms.PermutationString
 *  
 *  Purpose: Check if the arrays returned by two string functions i.e iterative
 *  		 function and recursive function which gives the permutation of a 
 *  		 given string are equal
 *
 *  @author  Naveen Adiga
 *  @version 1.0
 *  @since   20-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class PermutationString {
	/*
	* The main function is written to take input from the user and
	* call permute function that compares the permutation resulted 
	* by two methods
	*/
	public static void main(String[] args) {
//		FunctionalUtility func = new FunctionalUtility();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String str = sc.next(); //user input
		int len = str.length();
		System.out.println("recursion of a string is ");
		//Method 1- using static function of FunctionalUtilty class of com.bridgelabz.util package
		FunctionalUtility.recursion(str, 0, len);
		System.out.println("iteration of a string is ");
		//Method 2- using static function of FunctionalUtilty class of com.bridgelabz.util package
		FunctionalUtility.iteration(str);
		sc.close();
	}
}

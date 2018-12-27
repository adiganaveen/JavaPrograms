/******************************************************************************
 *  Compilation:  javac -d bin Binary.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprogram.Binary n
 *  
 *  Purpose: To convert decimal to binary, swap nibbles and find the decimal number
 *
 *  @author  Naveen Adiga
 *  @version 1.0
 *  @since   26-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.AlgorithmUtility;

public class Binary {
	/*
	 * The main function is written to take input from the user and calls swapNibble
	 * function to find the result after swapping nibbles
	 */
	public static void main(String[] args) {
		System.out.println("Enter the decimal number");
		// Reading input from the user
		int num = AlgorithmUtility.userInteger();
		// Method 1- using static function of AlgorithmUtility class of com.bridgelabz.util package
		int[] binary = AlgorithmUtility.decimalToBinary(num);
		int[] binary2 = new int[binary.length];
		int k = 0;
		for (int i = binary.length - 1; i >= 0; i--) {
			binary2[k] = binary[i];
			k++;

		}
		System.out.println();
		for (int i = 0; i < binary2.length; i++) {
			System.out.print(binary2[i]);
		}
		System.out.println();
		System.out.println("swaping nibbles");
		System.out.println();
		int first = 0, last = binary.length - 1;
		int middle = (first + last) / 2;
		// Method 2- using static function of AlgorithmUtility class of com.bridgelabz.util package
		int[] binary3 = AlgorithmUtility.swapNibble(first, middle, last, binary2);
		for (int i = 0; i < binary3.length; i++) {
			System.out.print(binary3[i]);
		}
		// Method 3- using static function of AlgorithmUtility class of com.bridgelabz.util package
		int sum = AlgorithmUtility.decimal(binary3);
		System.out.println();
		System.out.println("decimal number : " + sum);
		System.out.println();
		// Method 4- using static function of AlgorithmUtility class of com.bridgelabz.util package
		boolean b = AlgorithmUtility.powerOf2(sum);
		if (b == true)
			System.out.println("the resultant number " + sum + " is the number is a power of 2");
		else
			System.out.println("the resultant number " + sum + " is not the number is a power of 2");

	}

}

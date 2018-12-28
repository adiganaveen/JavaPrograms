/******************************************************************************
 *  Compilation:  javac -d bin BinarySearsch.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprogram.BinarySearsch n
 *  
 *  Purpose: To find whether the give key present in a csv file or not
 *
 *  @author  Naveen Adiga
 *  @version 1.0
 *  @since   26-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.AlgorithmUtility;

public class MergeSort {
	/*
	* The main function is written to take input from the user and
	* call mergeSort functions that sorts the given array.
	*/
	public static void main(String[] args) {
		System.out.println("Enter number of elements in an array");
		//Reading input number of data to be entered into the array
		int num=AlgorithmUtility.userInteger();
		String [] str=new String[num];
		for(int i=0;i<str.length;i++)
		{
			System.out.println("enter "+i+"th element of an array");
			//Reading input number of data to be entered into the array
			str[i]=AlgorithmUtility.userString();
		}
		//Method 1- using static function of AlgorithmUtility class of com.bridgelabz.util package
		AlgorithmUtility.sort(str,0,str.length-1);
		//Method 2- using static function of AlgorithmUtility class of com.bridgelabz.util package
		AlgorithmUtility.printArray(str);
		
	}

}

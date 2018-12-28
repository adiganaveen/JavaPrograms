/******************************************************************************
 *  Compilation:  javac -d bin FindANumber.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprogram.FindANumber n
 *  
 *  Purpose: To find a number
 *
 *  @author  Naveen Adiga
 *  @version 1.0
 *  @since   2-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.algorithmprograms;



import com.bridgelabz.util.AlgorithmUtility;

public class FindANumber {
	/*
	* The main function is written to take input from the user and and 
	* find a number
	*/

	public static void main(String[] args) 
	{
		System.out.println("enter the number");
		int num=AlgorithmUtility.userInteger();
		int range=(int)(Math.pow(2, num-1));
		System.out.println("Take number between 0 to "+(range-1));
		System.out.println();
		System.out.println("Is the number selected");
		AlgorithmUtility.userBoolean();
		int first=0;
		int last=range-1;
		int middle=(first+last)/2;
		int count=0;
		//Method 1- using static function of AlgorithmUtility class of com.bridgelabz.util package
		AlgorithmUtility.findNumber(first,last,middle,count,num);		

	}

}

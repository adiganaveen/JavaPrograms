/******************************************************************************
 *  Compilation:  javac -d bin ToBinary.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprogram.ToBinary n
 *  
 *  Purpose: Converts the given decimal number to binary number.
 *
 *  @author  Naveen Adiga
 *  @version 1.0
 *  @since   22-12-2018
 *
 ******************************************************************************/


package com.bridgelabz.algorithmprograms;



import com.bridgelabz.util.AlgorithmUtility;

public class ToBinary 
{
	/*
	* The main function is written to take input from the user and
	* call the toBinary function that converts decimal to binary
	*/
	public static void main(String[] args) {
//		AlgorithmUtility algo=new AlgorithmUtility();
//		Scanner sc=new Scanner(System.in);
		//Reading the input from the user
		System.out.println("enter the decimal number");
		int num=AlgorithmUtility.userInteger();
		//Method 1- using static function of AlgorithmUtility class of com.bridgelabz.util package
				
		int [] binary=AlgorithmUtility.toBinary(num);
		int len=binary.length;
		System.out.println(len);
		for(int i=binary.length-1;i>=0;i--)
		{
			System.out.print(binary[i]); //displaying result
		}
	}

}

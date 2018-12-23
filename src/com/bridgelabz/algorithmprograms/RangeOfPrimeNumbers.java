/******************************************************************************
 *  Compilation:  javac -d bin RangeOfPrimeNumbers.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprogram.RangeOfPrimeNumbers n
 *  
 *  Purpose: Finds the prime numbers in the given range
 *
 *  @author  Naveen Adiga
 *  @version 1.0
 *  @since   21-12-2018
 *
 ******************************************************************************/



package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtility;

public class RangeOfPrimeNumbers 
{

	/*
	* The main function is written to take input from the user and
	* call the primeNumber() function that finds prime numbers
	*/
	public static void main(String[] args) {
		AlgorithmUtility algo=new AlgorithmUtility();
		Scanner sc=new Scanner(System.in);
		//Reading inputs from user
		System.out.println("enter the range it where prime numbers has to be found");
		int num=sc.nextInt();
		for(int i=2;i<=num;i++)
		{

			//Method 1- using non-static function of AlgorithmUtility class of com.bridgelabz.util package
			
			boolean b=algo.findPrimeNumber(i);
			if(b==true)
			{
				System.out.println(i+" ");
			}
		}
	}
}

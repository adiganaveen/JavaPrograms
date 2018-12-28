/******************************************************************************
 *  Compilation:  javac -d bin Factors.java
 *  Execution:    java -cp bin package com.bridgelabz.functionalprograms.Factors
 *  
 *  Purpose: Computes the prime factorization of N using brute force
 *
 *  @author  Naveen Adiga
 *  @version 1.0
 *  @since   19-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class Factors 
{

	/*
	* The main function is written to take input from the user and
	* call primeFactor function that computes the prime factors.
	*/
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt(); //user input
		//Method 1- using static function of FunctionalUtilty class of com.bridgelabz.util package
		FunctionalUtility.primeFactors(n);
		sc.close();

	}

}

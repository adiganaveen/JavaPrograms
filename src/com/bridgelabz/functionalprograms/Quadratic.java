/******************************************************************************
 *  Compilation:  javac -d bin Quadratic.java
 *  Execution:    java -cp bin package com.bridgelabz.functionalprograms.Quadratic
 *  
 *  Purpose:  To find the roots of the equation a*x*x + b*x + c.
 *
 *  @author  Naveen Adiga
 *  @version 1.0
 *  @since   20-12-2018
 *
 ******************************************************************************/


package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class Quadratic 
{
	/*
	* The main function is written to take input from the user and
	* call quadratic function that find roots of the equation.
	*/
	public static void main(String[] args) 
	{
//		FunctionalUtility func=new FunctionalUtility();
		Scanner sc=new Scanner(System.in);
		System.out.println("give input a");
		//Reading the inputs from the user
		int a=sc.nextInt();
		System.out.println("give input b");
		//Reading the inputs from the user
		int b=sc.nextInt();
		System.out.println("give input c");
		//Reading the inputs from the user
		int c=sc.nextInt();
		//Method 1- using static function of FunctionalUtilty class of com.bridgelabz.util package
		FunctionalUtility.rootsValue(a,b,c);
		sc.close();
		
	}

}

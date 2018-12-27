/******************************************************************************
 *  Compilation:  javac -d bin PowerOf2.java
 *  Execution:    java -cp bin package com.bridgelabz.functionalprograms.PowerOf2
 *  
 *  Purpose: This program takes a command­line argument N and prints a table of the
 *  		 powers of 2 that are less than or equal to 2^N.
 *
 *  @author  Naveen Adiga
 *  @version 1.0
 *  @since   18-12-2018
 *
 ******************************************************************************/


package com.bridgelabz.functionalprograms;



import com.bridgelabz.util.FunctionalUtility;

public class PowerOf2 
{
	/*
	* The main function is written to take input from the user and
	* call powerOf2 function that prints the table of the powers of 2
	*/
	public static void main(String[] args) 
	{
//		FunctionalUtility func=new FunctionalUtility();
		String i=args[0];
		double res=0;
		//Reading the input from the user

		int exp=Integer.parseInt(i);
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the exponent value of 2");
//		double exp=sc.nextInt();
		double base=2;
		if(exp<0 || exp>30)
		{
			System.out.println("overflow values. Provide valid number");
		}
		else
		//Method 1- using static function of FunctionalUtilty class of com.bridgelabz.util package
		res=FunctionalUtility.pow(base, exp);
		System.out.println("value of 2 power " + exp + " is " + res);
	}

}

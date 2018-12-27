/******************************************************************************
 *  Compilation:  javac -d bin CouponNumbers.java
 *  Execution:    java -cp bin package com.bridgelabz.functionalprograms.CouponNumbers
 *  
 *  Purpose: Generates distinct coupon number and number of 
 *  		 random number required to get distinct coupon numbers
 *
 *  @author  Naveen Adiga
 *  @version 1.0
 *  @since   19-12-2018
 *
 ******************************************************************************/




package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;



public class CouponNumbers 
{
	/*
	* The main function is written to take input from the user and
	* calls couponNumber function that generates distinct coupon
	*  numbers
	*/
	public static void main(String[] args) 
	{
//		FunctionalUtility func=new FunctionalUtility();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter total number of coupon ");
		//Reading input number from the user
		int n=sc.nextInt();
		//Method 1- using static function of FunctionalUtilty class of com.bridgelabz.util package
		int count=FunctionalUtility.collect(n);
		System.out.println("count is "+count);
		sc.close();
	}

}

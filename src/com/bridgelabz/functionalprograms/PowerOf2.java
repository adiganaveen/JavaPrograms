//Power of 2 
/*Naveen Adiga
  18/12/2018
 */


package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class PowerOf2 
{
	public static void main(String[] args) 
	{
		FunctionalUtility func=new FunctionalUtility();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the exponent value of 2");
		double exp=sc.nextInt();
		double base=2;
		if(exp<0 || exp>30)
		{
			System.out.println("overflow values. Provide valid number");
		}
		else
		func.pow(base, exp);
	}

}

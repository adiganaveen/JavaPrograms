//Harmonic Number
/*Naveen Adiga
  18/12/2018
 */


package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class HarmonicNumber 
{
	public static void main(String[] args) 
	{
		FunctionalUtility func=new FunctionalUtility();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the harmonic value of n");
		int n=sc.nextInt();
		double value=func.harmonicValue(n);
		if(value==2)
		{
			System.out.println("invalid harmonic value");
		}
		else
		System.out.println("harmonic value of "+n+" is "+value);
		//func.harmonicValue(n);
	}
}

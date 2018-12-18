//Factors
/*Naveen Adiga
  18/12/2018
 */

package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class Factors 
{

	public static void main(String[] args) 
	{
		FunctionalUtility func=new FunctionalUtility();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		func.primeFactors(n);

	}

}

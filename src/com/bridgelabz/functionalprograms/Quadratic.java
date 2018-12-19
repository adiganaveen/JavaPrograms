//Quadratic Equation
/*Naveen Adiga
  19/12/2018
 */




package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class Quadratic 
{
	public static void main(String[] args) 
	{
		FunctionalUtility func=new FunctionalUtility();
		Scanner sc=new Scanner(System.in);
		System.out.println("give input a");
		int a=sc.nextInt();
		System.out.println("give input b");
		int b=sc.nextInt();
		System.out.println("give input c");
		int c=sc.nextInt();
		func.rootsValue(a,b,c);
		
	}

}

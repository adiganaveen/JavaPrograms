/******************************************************************************
 *  Compilation:  javac -d bin Gambler.java
 *  Execution:    java -cp bin package com.bridgelabz.functionalprograms.Gambler
 *  
 *  Purpose: Simulates a gambler who start with $stake and place fair $1 bets until 
 *  		he/she goes broke (i.e. has no money) or reach $goal. Keeps track of the number of
 *  		times he/she wins and the number of bets he/she makes and calculate win vs 
 *  		lose percentage.
 *
 *  @author  Naveen Adiga
 *  @version 1.0
 *  @since   19-12-2018
 *
 ******************************************************************************/


package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class Gambler 
{
	/*
	* The main function is written to take input from the user and
	* call gambler function that calculate win and lose percentage
	*/
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the stack");
		int stack=sc.nextInt(); //user input
		System.out.println("enter the goal");
		int goal=sc.nextInt(); //user input
		System.out.println("enter the number of times  ");
		int chance=sc.nextInt(); //user input
		//Method 1- using static function of FunctionalUtilty class of com.bridgelabz.util package
		FunctionalUtility.gambleing(stack,goal, chance);
		sc.close();
	}

}

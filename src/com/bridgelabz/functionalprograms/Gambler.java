package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class Gambler 
{
	public static void main(String[] args)
	{
		FunctionalUtility func=new FunctionalUtility();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the stack");
		int stack=sc.nextInt();
		System.out.println("enter the bet");
		int bet=sc.nextInt();
		System.out.println("enter the number of times  ");
		int chance=sc.nextInt();
		func.gambleing(stack, bet, chance);
	}

}

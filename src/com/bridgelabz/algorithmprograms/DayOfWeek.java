//Day Of Week
/*Naveen Adiga
  22/12/1996
 */



package com.bridgelabz.algorithmprograms;

import java.math.BigInteger;
import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtility;

public class DayOfWeek 
{
	public static void main(String[] args) {
//		String i=args[0];
//		String j=args[1];
//		String k=args[2];
//		int month=Integer.parseInt(i);
//		int day=Integer.parseInt(j);
//		int year=Integer.parseInt(k);
		AlgorithmUtility algo=new AlgorithmUtility();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter day");
		int day=sc.nextInt();
		System.out.println("enter month");
		int month=sc.nextInt();
		System.out.println("enter year");
		int year=sc.nextInt();
		System.out.println();
		algo.dayIs(month, day, year);
		
	}

}

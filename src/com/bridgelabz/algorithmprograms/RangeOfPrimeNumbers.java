package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtility;

public class RangeOfPrimeNumbers 
{
	public static void main(String[] args) {
		AlgorithmUtility algo=new AlgorithmUtility();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range it where prime numbers has to be found");
		int num=sc.nextInt();
		for(int i=2;i<=num;i++)
		{
			boolean b=algo.findPrimeNumber(i);
			if(b==true)
			{
				System.out.println(i+" ");
			}
		}
	}
}

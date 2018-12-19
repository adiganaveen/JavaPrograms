//Sum Of Three Integer Adds To Zero 
/*Naveen Adiga
  19/12/2018
 */



package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class SumOfThreeIntegerAddsToZero 
{

	public static void main(String[] args) 
	{
		FunctionalUtility func=new FunctionalUtility();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter total number of elements in an array");
		int num=sc.nextInt();
		int [] arr=new int[num];
		for(int i=0;i<num;i++)
		{
			System.out.println("enter array of "+i);
			arr[i]=sc.nextInt();
		}
		int n=arr.length;
		func.sumOfInterger(arr,n);


	}

}

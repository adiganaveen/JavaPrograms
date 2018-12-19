package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class Distance 
{
	public static void main(String[] args) 
	{
		FunctionalUtility func=new FunctionalUtility();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the range x");
		int x=sc.nextInt();
		System.out.println("enter the range y");
		int y=sc.nextInt();
		double result=func.getDistance(x,y);
		System.out.println("the Euclidean distance from the point ("+x+","+ y+") to the origin (0, 0) is "+result);
	}

}

//Coupon Number
/*Naveen Adiga
  19/12/2018666666666
 */





package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class CouponNumbers 
{
	public static void main(String[] args) 
	{
		FunctionalUtility func=new FunctionalUtility();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter total number of coupon ");
		int n=sc.nextInt();
		int count=func.collect(n);
		System.out.println("count is "+count);
		sc.close();
	}

}

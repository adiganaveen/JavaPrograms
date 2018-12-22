package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtility;

public class ToBinary 
{
	public static void main(String[] args) {
		AlgorithmUtility algo=new AlgorithmUtility();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the decimal number");
		int num=sc.nextInt();
		algo.toBinary(num);
	}

}

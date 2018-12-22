package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtility;

public class SqrtOfNumber {
	public static void main(String[] args) {
	AlgorithmUtility algo=new AlgorithmUtility();
	int i=0;
	do {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number number to find its square root");
    double num=sc.nextDouble();
    algo.sqrt(num);
    System.out.println();
    i++;
	}while(i<=5);
	}
}

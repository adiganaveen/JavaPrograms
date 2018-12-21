package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtility;

public class TemperatureConversion 
{
	public static void main(String[] args) {
		AlgorithmUtility algo=new AlgorithmUtility();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the celsius to be converted to fahrenheit");
        double celsius=sc.nextDouble();
        algo.tempCToF(celsius);
        System.out.println("enter the  to be converted to celsius");
        double fahrenheit=sc.nextDouble();
        algo.tempFToC(fahrenheit);
	}

}

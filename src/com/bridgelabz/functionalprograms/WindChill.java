/******************************************************************************
 *  Compilation:  javac -d bin WindChill.java
 *  Execution:    java -cp bin package com.bridgelabz.functionalprograms.WindChill
 *  
 *  Purpose: Given the temperature t (in Fahrenheit) and the wind speed v (in miles per hour),
 *  		 to calculate effective temperature (the wind chill)
 *
 *  @author  Naveen Adiga
 *  @version 1.0
 *  @since   19-12-2018
 *
 ******************************************************************************/


package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class WindChill {
	/*
	* The main function is written to take input from the user and
	* call WindChill function that calculates the effective temperature
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature t in Fahrenheit");
		//Reading the inputs from the user
		double t = sc.nextDouble();
		System.out.println("Enter the wind speed v in in miles per hour");
		//Reading the inputs from the user
		double v = sc.nextDouble();
		//Method 1- using static function of FunctionalUtilty class of com.bridgelabz.util package
		System.out.println("the National Weather Service defines the effective temperature (the wind chill) to be: "
				+ FunctionalUtility.calcWindChill(t, v));
		sc.close();
	}

}

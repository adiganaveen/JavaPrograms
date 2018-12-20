//wind chill
/*Naveen Adiga
  20/12/2018
 */



package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class WindChill {
	public static void main(String[] args) {
		FunctionalUtility func = new FunctionalUtility();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature t in Fahrenheit");
		double t = sc.nextDouble();
		System.out.println("Enter the wind speed v in in miles per hour");
		double v = sc.nextDouble();
		System.out.println("the National Weather Service defines the effective temperature (the wind chill) to be: "
				+ func.calcWindChill(t, v));
	}

}

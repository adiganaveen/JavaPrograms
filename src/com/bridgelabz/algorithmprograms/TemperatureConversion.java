/******************************************************************************
 *  Compilation:  javac -d bin TemperatureConversion.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprogram.TemperatureConversion n
 *  
 *  Purpose: Converts the temperture given to Fahrenheit or Celcius temperature
 *
 *  @author  Naveen Adiga
 *  @version 1.0
 *  @since   21-12-2018
 *
 ******************************************************************************/




package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtility;

public class TemperatureConversion 
{
	/*
	* The main function is written to take input from the user and
	* call the tempConversion function that converts temperature
	*/
	public static void main(String[] args) {
		AlgorithmUtility algo=new AlgorithmUtility();
        Scanner sc=new Scanner(System.in);
      //Reading the input from the user
        System.out.println("enter the celsius to be converted to fahrenheit");
        double celsius=sc.nextDouble();
      //Method 1- using non-static function of AlgorithmUtility class of com.bridgelabz.util package
        algo.tempCToF(celsius);
      //Reading the input from the user
        System.out.println("enter the  to be converted to celsius");
        double fahrenheit=sc.nextDouble();
      //Method 2- using non-static function of AlgorithmUtility class of com.bridgelabz.util package
        algo.tempFToC(fahrenheit);
	}

}

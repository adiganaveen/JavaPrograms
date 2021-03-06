/******************************************************************************
 *  Compilation:  javac -d bin SqrtOfNumber.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprogram.SqrtOfNumber n
 *  
 *  Purpose: Finds the square root of the given number using Newton's Method
 *
 *  @author  Naveen Adiga
 *  @version 1.0
 *  @since   21-12-2018
 *
 ******************************************************************************/



package com.bridgelabz.algorithmprograms;



import com.bridgelabz.util.AlgorithmUtility;

public class SqrtOfNumber {
	/*
	* The main function is written to take input from the user and
	* call the squareRoot() function that finds square root of a number
	*/
	public static void main(String[] args) {
  //Reading input from the user
    System.out.println("enter the number number to find its square root");
    double num=AlgorithmUtility.userDouble();
  //Method 1- using static function of AlgorithmUtility class of com.bridgelabz.util package
    double t=AlgorithmUtility.sqrt(num);
    System.out.println("square of " + num + " is : " + t);
    System.out.println();
	}
}

/******************************************************************************
 *  Compilation:  javac -d bin MonthlyPayment.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprogram.MonthlyPayment n
 *  
 *  Purpose: Determines monthly payment for the given principle amount,
 *  		 years to pay off and percentage rate of the interest amount.
 *
 *  @author  Naveen Adiga
 *  @version 1.0
 *  @since   21-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.algorithmprograms;



import com.bridgelabz.util.AlgorithmUtility;

public class MonthlyPayment {

	/*
	* The main function is written to take input from the user and
	* call the monthlyPayment() function calculates monthly payment
	*/
	public static void main(String[] args) {
      //Reading inputs from user
        System.out.println("enter PRINCIPAL loan amount");
        double p=AlgorithmUtility.userDouble(); //user input
        System.out.println("enter per cent of interest");
        double r=AlgorithmUtility.userDouble(); //user input
        System.out.println("enter number of years");
        double y=AlgorithmUtility.userDouble(); //user input
      //Method 1- using static function of AlgorithmUtility class of com.bridgelabz.util package	
		double payment=AlgorithmUtility.payment(p, r, y);
		System.out.println("total payment is " + payment);//displaying output
	}
}

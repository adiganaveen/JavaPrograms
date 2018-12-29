/******************************************************************************
 *  Compilation:  javac -d bin VendingMachine.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprogram.VendingMachine n
 *  
 *  Purpose:  To find the fewest notes to be returned to the vending machine
 *
 *  @author  Naveen Adiga
 *  @version 1.0
 *  @since   21-12-2018
 *
 ******************************************************************************/



package com.bridgelabz.algorithmprograms;

//import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtility;

public class VendingMachine 
{
	/*
	* The main function is written to take input from the user and
	* call the vendingMachine function that finds the fewest notes 
	* to be returned to the vending machine
	*/
	public static void main(String[] args) {
        System.out.println("Enter amount to be getting from vending machine");
        int money=AlgorithmUtility.userInteger(); //user input
        int [] curr= {1,2,5,10,50,100,500,1000};
        System.out.println("Types and number of notes to be given is : ");
      //Method 1- using static function of AlgorithmUtility class of com.bridgelabz.util package
      		
        int temp=AlgorithmUtility.minChange(curr,money);
        System.out.println("minimum number of notes to be given is " + temp); //displaying result 
	}

}

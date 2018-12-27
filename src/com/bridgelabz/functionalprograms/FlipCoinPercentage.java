/******************************************************************************
 *  Compilation:  javac -d bin FlipCoinPercentage.java
 *  Execution:    java -cp bin package com.bridgelabz.functionalprograms.FlipCoinPercentage
 *  
 *  Purpose:  Flip Coin and print percentage of Heads and Tails
 *
 *  @author  Naveen Adiga
 *  @version 1.0
 *  @since   18-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class FlipCoinPercentage {
	/*
	* The main function is written to take input from the user and
	* calls perHeadTail function that calculate head vs tail percenatage 
	* after flipping a coin n number of times
	*/
	public static void main(String[] args) {
//		FunctionalUtility func = new FunctionalUtility();
		int i=0;
		Scanner sc=null;
		do {
		 sc= new Scanner(System.in);
		System.out.println("Enter number of times to flip a coin");
		int times = sc.nextInt(); //user input
		//Method 1- using static function of FunctionalUtilty class of com.bridgelabz.util package
		FunctionalUtility.flipCoin(times);
		i++;
		}while(i<6);
		sc.close();
	}

}

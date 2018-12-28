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
		int i=0;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Select your choice :");
			System.out.println("1. Flip a coin \n2. exit");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1 :
					System.out.println("Enter number of times to flip a coin");
					int times = sc.nextInt(); //user input
					//Method 1- using static function of FunctionalUtilty class of com.bridgelabz.util package
					FunctionalUtility.flipCoin(times);
					break;
			case 2:System.exit(0);
					break;
			default :System.out.println("please select correct choice ");
					break;
			}
		i++;
		}while(i<30);
		sc.close();
	}

}

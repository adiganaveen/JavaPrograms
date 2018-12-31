/******************************************************************************
 *  Compilation:  javac -d bin CouponNumbers.java
 *  Execution:    java -cp bin package com.bridgelabz.functionalprograms.CouponNumbers
 *  
 *  Purpose: Generates distinct coupon number and number of 
 *  		 random number required to get distinct coupon numbers
 *
 *  @author  Naveen Adiga
 *  @version 1.0
 *  @since   27-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;


import com.bridgelabz.util.FunctionalUtility;


public class CrossGame {
	/*
	* The main function is written to take input from the user and
	* call cross game function to check who wins.
	*/
	static int player = 0;
	static int[][] BOARD = new int[3][3];
	static boolean isEmpty = true;
	
	public static void main(String [] args) {
		int count=0;
		FunctionalUtility.initialBoard(BOARD);
		while (isEmpty) {
			System.out.println("Players turn");
			FunctionalUtility.putVal(player,BOARD);
			FunctionalUtility.displayBoard(BOARD);
			if (FunctionalUtility.checkWinner(player,BOARD)) {
				System.out.println("Player won");
				return;
			}
			player = 1;
			count++;
			if(count<5)
			{
			System.out.println("Computers turn");
			FunctionalUtility.putVal(player,BOARD);
			FunctionalUtility.displayBoard(BOARD);
			if (FunctionalUtility.checkWinner(player,BOARD)) {
				System.out.println("Computer won");
				return;
			}
			}
			else
			{
				System.out.println("its a draw");
				break;
			}
			player = 0;
		}
	}
   }

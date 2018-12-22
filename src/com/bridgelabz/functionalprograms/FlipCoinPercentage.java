//Flip Coin and print percentage of Heads and Tails
/*Naveen Adiga
  18/12/2018
 */

package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class FlipCoinPercentage {
	public static void main(String[] args) {
		FunctionalUtility func = new FunctionalUtility();
		int i=0;
		do {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of times to flip a coin");
		int times = sc.nextInt();
		func.flipCoin(times);
		i++;
		}while(i<5);
	}

}

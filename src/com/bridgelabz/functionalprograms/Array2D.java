//2D Array
/*Naveen Adiga
  19/12/2018
 */

package com.bridgelabz.functionalprograms;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class Array2D {
	public static void main(String[] args) throws IOException {
		FunctionalUtility func = new FunctionalUtility();
		Scanner sc = new Scanner(System.in);
		System.out.print("Input total row : ");
		int row = sc.nextInt();
		System.out.print("Input total column : ");
		int column = sc.nextInt();
		System.out.println("1:Integer Array\n" + "2:Double Array\n" + "3:Boolean Array");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			Integer[][] arr1 = func.arrayInt(row, column);
			func.display(arr1);
			break;
		case 2:
			Double[][] arr2 = func.arrayDouble(row, column);
			func.display(arr2);
			break;
		case 3:
			Boolean[][] arr3 = func.arrayBoolean(row, column);
			func.display(arr3);
			break;
		default:
			System.out.println("Please select any option between 1, 2 and 3");
			break;
		}

		// func.display(arr1,arr2,arr3,0 row, column);
	}

}

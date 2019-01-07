/******************************************************************************
 *  Compilation:  javac -d bin BalancedParenthesis.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprogram.BalancedParenthesis n
 *  
 *  Purpose: Simple Balanced Parentheses
 *
 *  @author  Naveen Adiga
 *  @version 1.0
 *  @since   2-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.datastructuresprograms;

import com.bridgelabz.util.DataStructureUtility;

public class BalancedParenthesis {
	/*
	* The main function is written to take input from the user and and 
	* call the isBalanced function that checks if the parantheses of 
	* the entered arithmetic expression
	*/
	public static <T> void main(String[] args) throws Exception {
		DataStructureUtility d=new DataStructureUtility();
		int n=0;
		do
		{
			System.out.println("1.Enter the expression\n2.To exit program");
			int choice=DataStructureUtility.userInteger();
			switch(choice)
			{
			case 1:System.out.println("Enter expression: ");
					String str = DataStructureUtility.userString();
					char[] ch = str.toCharArray();
					//Method 1- using static function of Utility class of com.bridgelabz.util package
					if (d.isBalanced(ch)) {
						System.out.println(str+" is a balanced expression");
					}
					else
					{
						System.out.println(str +" is not a balanced expression");
					}
					break;
			case 2:System.out.println("Thankyou");
					System.exit(0);
					break;
			default:System.out.println("Please select correct choice");
			}
		n++;
		}while(n<30);
	}
}
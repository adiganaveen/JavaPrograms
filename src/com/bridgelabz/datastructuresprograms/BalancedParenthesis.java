package com.bridgelabz.datastructuresprograms;

import com.bridgelabz.util.DataStructureUtility;
import com.bridgelabz.util.Stack;

public class BalancedParenthesis {
	public static void main(String[] args) throws Exception {
		Stack stack = new Stack();
		int n=0;
		do
		{
			System.out.println("1.Enter the expression\n2.To exit program");
			int choice=DataStructureUtility.userInteger();
			switch(choice)
			{
			case 1:System.out.println("Enter expression: ");
					String str = DataStructureUtility.userString();
					int len = str.length();
					char[] ch = str.toCharArray();
					if (stack.isBalanced(ch)) {
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
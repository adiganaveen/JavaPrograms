package com.bridgelabz.datastructuresprograms;

import com.bridgelabz.util.DataStructureUtility;

public class BalancedParenthesis
{
	public static void main(String[] args) throws Exception 
	{
		System.out.println("Enter max size: ");
		int n=DataStructureUtility.userInteger();

		Stack stack = new Stack(n);
		System.out.println();
		System.out.println("Parenthesis Matching");
		System.out.println();
		System.out.println("Enter expression: ");
		String str = DataStructureUtility.userString();      
		int len = str.length();
		System.out.println("Matches and Mismatches: ");

		for (int i = 0; i < len; i++)
		{    
		char ch = str.charAt(i);

			if (ch == '(')
			{
			stack.push(i);
			}
				else if (ch == ')')
				{
					try
					{
					long p = (stack.pop() + 1);
					System.out.println("'(' at index "+p+" matched with ')' at index "+(i+1));
					System.out.println("Its is a balanced parenthesis");
					}
					catch(Exception e)
					{
					System.out.println("')' at index "+(i+1)+" is unmatched");
					System.out.println("Its is not a balanced parenthesis");
					}
					
				}            
			}
		while (!stack.isEmpty() )
		{
		System.out.println("'(' at index "+(stack.pop() +1)+" is unmatched");
		System.out.println("Its is not a balanced parenthesis");
		}                          
    }
}
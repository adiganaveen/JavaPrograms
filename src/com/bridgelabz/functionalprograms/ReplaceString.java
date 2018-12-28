/******************************************************************************
 *  Compilation:  javac -d bin ReplaceString.java
 *  Execution:    java -cp bin package com.bridgelabz.functionalprograms.ReplaceString
 *  
 *  Purpose:  User Input and Replace String Template “Hello <<UserName>>, How are you?”
 *
 *  @author  Naveen Adiga
 *  @version 1.0
 *  @since   18-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.functionalprograms;
import com.bridgelabz.util.*;
import java.util.Scanner;

public class ReplaceString 
{
	/*
	* The main function is written to take input from the user and
	* call replaceString function that replaces the template with user
	* input
	*/
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str="Hello <<UserName>>, How are you?";
		System.out.println("enter user name");
		String uname=sc.nextLine();
		if (uname.length() < 3) {
		System.out.println("enter a name greater than 3 alphabets");
		}
		//Method 1- using static function of FunctionalUtilty class of com.bridgelabz.util package
		String message=FunctionalUtility.replaceString(str,uname);
		System.out.println(message);
		sc.close();
	}

}

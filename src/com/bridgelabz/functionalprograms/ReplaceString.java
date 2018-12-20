//User Input and Replace String Template �Hello <<UserName>>, How are you?�
/*Naveen Adiga
18/12/2018*/

package com.bridgelabz.functionalprograms;
import com.bridgelabz.util.*;
import java.util.Scanner;

public class ReplaceString 
{
	public static void main(String[] args)
	{
		FunctionalUtility func=new FunctionalUtility();
		Scanner sc=new Scanner(System.in);
		String str="Hello <<UserName>>, How are you?";
		System.out.println("enter user name");
		String uname=sc.nextLine();
		func.replaceString(str,uname);
	}

}

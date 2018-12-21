//Anagram Detection
/*Naveen Adiga
  21/12/2018
 */


package com.bridgelabz.algorithmprograms;

import java.security.AlgorithmConstraints;
import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtility;

public class AnagramDetection 
{
	public static void main(String[] args) {
		AlgorithmUtility algo=new AlgorithmUtility();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first string");
		String str1=sc.nextLine();
		System.out.println("Enter the second string");
		String str2=sc.nextLine();
		boolean b1=algo.anagramDetection(str1,str2);
		if(b1==true)
		{
			System.out.println("the given two strings "+str1+" and "+str2+" are anagram");
		}
		else 
			System.out.println("the given two strings "+str1+" and "+str2+" are not an anagram");
	}
}

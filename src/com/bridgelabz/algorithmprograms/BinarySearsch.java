/******************************************************************************
 *  Compilation:  javac -d bin BinarySearsch.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprogram.BinarySearsch n
 *  
 *  Purpose: Converts the given decimal number to binary number.
 *
 *  @author  Naveen Adiga
 *  @version 1.0
 *  @since   22-12-2018
 *
 ******************************************************************************/


package com.bridgelabz.algorithmprograms;

import java.util.Arrays;
import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtility;

public class BinarySearsch 
{
	public static void main(String[] args) {
		AlgorithmUtility algo=new AlgorithmUtility();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of names which has to be written");
		int num=sc.nextInt();
		String [] names=algo.binarySearch(num);
		System.out.println("enter the key word which has to be searched ");
		String key=sc.next();
		int i=Arrays.binarySearch(names, key);
		if(i>=0)
		{
		System.out.println(names[i]+" is present in "+(i+1)+" position in the array");
		}
		else
		System.out.println("name doesnot exists in the given array");
	}

}

/******************************************************************************
 *  Compilation:  javac -d bin InsertionSort.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprogram.InsertionSort n
 *  
 *  Purpose: Sorts array of strings using insertion sort.
 *
 *  @author  Naveen Adiga
 *  @version 1.0
 *  @since   21-12-2018
 *
 ******************************************************************************/




package com.bridgelabz.algorithmprograms;



import com.bridgelabz.util.AlgorithmUtility;

public class InsertionSort {
	/*
	* The main function is written to take input from the user and calls 
	* the function insertionSort that sorts the array
	*/
    public static void main(String[] args)
    {  
      //Reading inputs from the user
        System.out.println("enter the number of string to be entered");
        int num=AlgorithmUtility.userInteger(); //user input
        String[] str=new String[num];
        for(int i=0;i<str.length;i++)
        {
        	System.out.println("enter "+(i+1)+" string");
        	str[i]=AlgorithmUtility.userString(); //user input
        }
      //Method 1- using static function of AlgorithmUtility class of com.bridgelabz.util package
      		
        String[] str2=AlgorithmUtility.sortArray1(str);
        int n=str.length;
        for(int i=0;i<n;i++)
        {
        	System.out.println(str2[i] + " element in position "+i);
        }

        } 
    } 
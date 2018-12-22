//Insertion sort
/*Naveen Adiga
  21/12/2018
 */




package com.bridgelabz.algorithmprograms;


import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtility;

public class InsertionSort {
    public static void main(String[] args)
    {  
        AlgorithmUtility algo=new AlgorithmUtility();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of string to be entered");
        int num=sc.nextInt();
        String[] str=new String[num];
        for(int i=0;i<str.length;i++)
        {
        	System.out.println("enter "+(i+1)+" string");
        	str[i]=sc.next();
        }
        String[] str2=algo.sortArray(str);
        int n=str.length;
        for(int i=0;i<n;i++)
        {
        	System.out.println(str2[i] + " element in position "+i);
        }

        } 
    } 
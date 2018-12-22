package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtility;

public class BubbleSort 
{
	public static void main(String[] args) {
		AlgorithmUtility algo=new AlgorithmUtility();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements in an array");
        int num=sc.nextInt();
        int [] arr=new int[num];
        for(int i=0;i<arr.length;i++)
        {
        	System.out.println("enter "+i+"th element of an array");
        	arr[i]=sc.nextInt();
        }
        int [] newarr=algo.bubbleSort(arr,arr.length);
        for(int i=0;i<newarr.length;i++)
        {
        	System.out.println(" sorted elements are");
        	System.out.println(arr[i]);
        }
	}
}

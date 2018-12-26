/******************************************************************************
 *  Compilation:  javac -d bin UtilityClass.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprogram.UtilityClass n
 *  
 *  Purpose: Output the Search and Sorted List. More importantly print elapsed time
 *	performance in descending order
 *
 *  @author  Naveen Adiga
 *  @version 1.0
 *  @since   24-12-2018
 *
 ******************************************************************************/


package com.bridgelabz.algorithmprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtility;

public class UtilityClass 
{
	public static void main(String[] args) 
	{
		
		Map<String, Integer> map=new HashMap();
//		map.put(key, value);
//		Scanner scanner=new Scanner(System.in);
		System.out.println("1.Binary Search\n 2.Insertion sort\n 3.Bubble sort");
		int choice1=AlgorithmUtility.userInteger();
		switch(choice1)
		{
		case 1: System.out.println("1. Binary search for integer\n 2.Binary Search for String");
			    int choice2=AlgorithmUtility.userInteger();
			    switch(choice2)
			    {
			    case 1 : System.out.println("Enter the number of elements in an array");
			    		int num1=AlgorithmUtility.userInteger();
			    		int [] arr=new int[num1];
			    		for(int i=0;i<arr.length;i++)
			    		{
			    			System.out.println("enter "+i+" element of an array");
			    			arr[i]=AlgorithmUtility.userInteger();
			    		}
			    		
//			    		for(int i=0;i<arr2.length;i++)
//			    		{
//			    			System.out.println(arr2[i]);
//			    		}
			    		System.out.println("Enter the key :");
			    		int key1=AlgorithmUtility.userInteger();
			    		long start_time1=System.nanoTime();
			    		int [] arr2=AlgorithmUtility.sort(arr);
			    		int i = AlgorithmUtility.binarySearch(arr2, key1);
			    		long stop_time1=System.nanoTime();
						if (i >= 0) {
							System.out.println(arr2[i] + " is present in " + (i + 1) + " position in the array");
						} else
						{
							System.out.println(key1 + " doesnot exists in the given csv file");
						}
						long elapsed_time1=stop_time1-start_time1;
						System.out.println("elapsed time is :"+elapsed_time1);
			    		break;
			    		
			    case 2: System.out.println("Enter the number of elements in an array");
	    				int num2=AlgorithmUtility.userInteger();
	    				String [] str1=new String[num2];
	    				for(int j=0;j<str1.length;j++)
	    				{
	    					System.out.println("enter "+j+" element of an string array");
	    					str1[j]=AlgorithmUtility.userString();
	    				}
	    				String [] str2=AlgorithmUtility.sort(str1);
			    		for(int j=0;j<str2.length;j++)
			    		{
			    			System.out.println(str2[j]);
			    		}
			    		System.out.println("Enter the key :");
			    		String key2=AlgorithmUtility.userString();
			    		long start_time2=System.nanoTime();
			    		int j = AlgorithmUtility.binarySearch(str2, key2);
			    		long stop_time2=System.nanoTime();
						if (j >= 0) {
							System.out.println(str2[j] + " is present in " + (j + 1) + " position in the array");
						} else {
							System.out.println(key2 + " doesnot exists in the given csv file");
						}
						long elapsed_time2=stop_time2-start_time2;
						System.out.println("elapsed time is :"+elapsed_time2);
	    				break;
			    default : System.out.println("Please select correct choice ");
			    		  break;
			    }
			    break;
		case 2: System.out.println("1. Insertion sort for integer\n 2.Insertion sort for String");
	    		int choice3=AlgorithmUtility.userInteger();
	    		switch(choice3)
	    		{
	    		case 1 : System.out.println("Enter the number of elements in an array");
	    				int num1=AlgorithmUtility.userInteger();
	    				int [] arr=new int[num1];
	    				for(int i=0;i<arr.length;i++)
	    				{
	    					System.out.println("enter "+i+" element of an array");
	    					arr[i]=AlgorithmUtility.userInteger();
	    				}
	    				long start_time1=System.nanoTime();
	    				int[] arr2=AlgorithmUtility.sortArray(arr);
	    				long stop_time1=System.nanoTime();
				        int n=arr2.length;
				        for(int i=0;i<n;i++)
				        {
				        	System.out.println(arr2[i] + " element in position "+i);
				        }
				        long elapsed_time1=stop_time1-start_time1;
						System.out.println("elapsed time is :"+elapsed_time1);
	    				break;
	    		
	    		case 2: System.out.println("Enter the number of elements in an array");
						int num2=AlgorithmUtility.userInteger();
						String [] str1=new String[num2];
						for(int i=0;i<str1.length;i++)
						{
							System.out.println("enter "+i+" element of an string array");
							str1[i]=AlgorithmUtility.userString();
						}
						long start_time2=System.nanoTime();
						String[] str2=AlgorithmUtility.sortArray(str1);
						long stop_time2=System.nanoTime();
				        int m=str2.length;
				        for(int i=0;i<m;i++)
				        {
				        	System.out.println(str2[i] + " element in position "+i);
				        }
				        long elapsed_time2=stop_time2-start_time2;
						System.out.println("elapsed time is :"+elapsed_time2);
						break;
	    		default : System.out.println("Please select correct choice ");
	    		break;
	    		}
	    		break;
		case 3: System.out.println("1. Bubble sort for integer\n 2.Bubble Sort for String");
				int choice4=AlgorithmUtility.userInteger();
				switch(choice4)
				{
				case 1 : System.out.println("Enter the number of elements in an array");
	    				int num1=AlgorithmUtility.userInteger();
	    				int [] arr=new int[num1];
	    				for(int i=0;i<arr.length;i++)
	    				{
	    					System.out.println("enter "+i+" element of an array");
	    					arr[i]=AlgorithmUtility.userInteger();
	    				}
	    				long start_time1=System.nanoTime();
	    				int [] newarr=AlgorithmUtility.bubbleSort(arr,arr.length);
	    				long stop_time1=System.nanoTime();
  			        	System.out.println(" sorted elements are");
	    			        for(int i=0;i<newarr.length;i++)
	    			        {
	    			        	System.out.println(arr[i]);
	    			        }
	    			    long elapsed_time1=stop_time1-start_time1;
						System.out.println("elapsed time is :"+elapsed_time1);
	    				break;
	    		
				case 2: System.out.println("Enter the number of elements in an array");
						int num2=AlgorithmUtility.userInteger();
						String [] str1=new String[num2];
						for(int i=0;i<str1.length;i++)
						{
							System.out.println("enter "+i+" element of an string array");
							str1[i]=AlgorithmUtility.userString();
						}
						long start_time2=System.nanoTime();
						String [] str =AlgorithmUtility.bubbleSort(str1,str1.length);
						long stop_time2=System.nanoTime();
						System.out.println(" sorted elements are");
    			        for(int i=0;i<str.length;i++)
    			        {
    			        	System.out.println(str[i]);
    			        }
    			        long elapsed_time2=stop_time2-start_time2;
						System.out.println("elapsed time is :"+elapsed_time2);
						break;
				default : System.out.println("Please select correct choice ");
				break;
				}
				break;
		default : System.out.println("Please select correct choice ");
		break;
		}
		
	}

}

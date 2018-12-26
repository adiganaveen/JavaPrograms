package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.AlgorithmUtility;

public class MergeSort {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Enter number of elements in an array");
		int num=AlgorithmUtility.userInteger();
		String [] str=new String[num];
		for(int i=0;i<str.length;i++)
		{
			System.out.println("enter "+i+"th element of an array");
			str[i]=AlgorithmUtility.userString();
		}
		//int first=0,last=arr.length-1;
		AlgorithmUtility.sort(str,0,str.length-1);
		AlgorithmUtility.printArray(str);
		
	}

}

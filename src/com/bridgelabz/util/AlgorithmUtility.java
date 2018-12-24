//Algorithm Utility
/*Naveen Adiga
  21/12/2018
 */

package com.bridgelabz.util;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class AlgorithmUtility {
	
	static Scanner scanner;
	
	public AlgorithmUtility()
	{
		scanner=new Scanner(System.in);
	}
	
	public static int userInteger()
	{
		try {
			return scanner.nextInt();
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
	 
		return 0;
	}
	
	
	
	
	
	
	// anagram detection
	public boolean anagramDetection(String str1, String str2) {
		char[] ch1 = str1.toLowerCase().toCharArray();
		char[] ch2 = str2.toLowerCase().toCharArray();
		int f = ch1.length - 1;
		if (ch1.length != ch2.length) {
			return false;
		} else {
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			for (int i = 0; i < ch1.length; i++) {
				if (ch1[i] == ch2[i]) {
					return true;
				}
//			str1 = String.valueOf(ch1);
//			str2 = String.valueOf(ch2);
//			boolean  b = str1.equals(str2);
//			{
//				if (b == true)
//					return true;
//			}
			}
			return false;
		}

	}

	// to find range of prime numbers
	public boolean findPrimeNumber(long num) {
//		int flag=0;
//		for(int i=2;i<num;i++)
//		{
//			for(int j=2;j<i;j++)
//			{
//				if(i%j==0)
//				{
//					flag=0;
//				}
//				else 
//					flag=1;
//			}
//			if(flag==1)
//			{
//				System.out.println(i+" ");
//			}
//		}
		BigInteger b = new BigInteger(String.valueOf(num));
		return b.isProbablePrime(1);
	}
	
	
	// insertion sort
	public static String[] sortArray(String str[]) {
		int length=str.length;
		for(int i=1;i<length;i++)
		{
			String key=str[i];
			int j=i-1;
			while(j>=0 && ((str[j].compareTo(key)>0)))
			{
				str[j+1]=str[j];
				j=j-1;
			}
			str[j+1]=key;
		}
		return str;
	}

	// Vending Machine

	public void minChange(int[] curr, int money) {

		int cash = money;
		int temp = 0;
		Arrays.sort(curr);
		for (int i = curr.length - 1; i >= 0; i--) {
			int count = 0;
			if (curr[i] <= cash) {
				count = cash / curr[i];
				cash = cash % curr[i];
				temp += count;
			}
			if (count > 0)
				System.out.println(count + " x " + curr[i] + "rs");
		}
		System.out.println("minimum number of notes to be given is " + temp);

	}

	// Celsius to Fahrenheit:
	public void tempCToF(double celsius) {
		double temp = (celsius * 9 / 5) + 32;
		System.out.println("fahrenheit =" + temp);
	}

	// Fahrenheit to Celsius

	public void tempFToC(double fahrenheit) {
		double temp = (fahrenheit - 32) * 5 / 9;
		System.out.println("celsius =" + temp);
	}

	// monthly payment
	public static void payment(double p, double r, double y) {
		double n = 12 * y;
		double t = r / (12 * 100);
		double payment = (p * t) / (1 - Math.pow((1 + t),-n));
		System.out.println("total payment is " + payment);
	}

	// bubble sort
	public static int[] bubbleSort(int[] arr, int len) {
			for (int i = 0; i < len; i++){
			for (int j = i+1; j < len; j++) {
				if (arr[i] > arr[j]) {
					swap(i, j, arr);
				}
			}
		}
		return arr;
	}

	public static void swap(int j, int k, int[] arr) {
		int temp;
		temp = arr[j];
		arr[j] = arr[k];
		arr[k] = temp;
	}

	// square root of a number
	public void sqrt(double num) {
		double t = num;
		double epsilon = 1e-15;
		if (num > 0) {
			while (Math.abs(t - num / t) > (epsilon * t)) {
				t = ((num / t) + t) / 2;
			}
		}
		System.out.println("square of " + num + " is : " + t);

	}

	// day of week
	public void dayIs(int month, int day, int year) {
		int year1 = year - (14 - month) / 12;
		int x = year1 + year1 / 4 - year1 / 100 + year1 / 400;
		int month1 = month + 12 * ((14 - month) / 12) - 2;
		int day1 = (day + x + 31 * month1 / 12) % 7;
		String[] str = { "sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday" };
		System.out.println(str[day1]);
//		for (int m = 0; m < str.length; m++) {
//			if (m == day1) {
//				System.out.println("Day is " + str[m]);
//
//			}
//		}
	}
	
	//to binary
	public static void toBinary(int num)
	{
		int[] binary=new int[100];
		int i=0;
		while(num>0)
		{
			 binary[i]=num%2;
			 num=num/2;
			 i++;
		}
		for(int j=i;j>=0;j--)
		{
			System.out.print(binary[j]);
		}
	}
	
	//binary search
	
	public static String []  sort(String [] str)
	{
		int len=str.length;
		for (int i = 0; i < len; i++){
			for (int j = i+1; j < len; j++) {
				if (str[i].compareTo(str[j])>0) {
					String temp;
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
		return str;
	}
	
	public static int binarySearch(String [] str,String key)
	{
		//int n=str.length;
		int first  = 0;
	    int last   = str.length - 1;
	    int middle = (first + last)/2;
	 
	    while( first <= last )
	    {
	      if ( str[middle].compareTo(key)<0 )
	        first = middle + 1;    
	      else if ( str[middle].compareTo(key)==0 )
	      {
	       return middle;
	      }
	      else
	         last = middle - 1;
	 
	      middle = (first + last)/2;
	   }
	 return -1;
	}
	
	//utility class
	public static int []  sort(int [] arr)
	{
		int len=arr.length;
		for (int i = 0; i < len; i++){
			for (int j = i+1; j < len; j++) {
				if (arr[i]>arr[j]) {
					int temp;
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	
	public static int binarySearch(int [] arr,int key)
	{
		//int n=str.length;
		int first  = 0;
	    int last   = arr.length - 1;
	    int middle = (first + last)/2;
	 
	    while( first <= last )
	    {
	      if (arr[middle]<key)
	        first = middle + 1;    
	      else if ( arr[middle]==key)
	      {
	       return middle;
	      }
	      else
	         last = middle - 1;
	 
	      middle = (first + last)/2;
	   }
	 return -1;
	}
	
	public static int[] sortArray(int arr[]) {
		int length=arr.length;
		for(int i=1;i<length;i++)
		{
			int key=arr[i];
			int j=i-1;
			while(j>=0 && (arr[j]>key))
			{
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
		return arr;
	}
	
	public static String[] bubbleSort(String[] str, int len) {
		for (int i = 0; i < len; i++){
		for (int j = i+1; j < len; j++) {
			if (str[i].compareTo(str[j])>0) {
				swap(i, j, str);
			}
		}
	}
	return str;
	}
	public static void swap(int j, int k, String[] str) {
		String temp;
		temp = str[j];
		str[j] = str[k];
		str[k] = temp;
}
}

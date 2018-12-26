//Algorithm Utility
/*Naveen Adiga
  21/12/2018
 */

package com.bridgelabz.util;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class AlgorithmUtility {
	
	static Scanner scanner=new Scanner(System.in);
	
//	public AlgorithmUtility()
//	{
//		scanner=;
//	}
	
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
	public static double userDouble()
	{
		try {
			return scanner.nextDouble();
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
	 
		return 0.0;
	}
	public static boolean userBoolean()
	{
		try {
			return scanner.nextBoolean();
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
	 
		return false;
	}
	public static String userString()
	{
		try {
			return scanner.next();
		}
		catch(Exception e){
			e.printStackTrace();
			
		}
		return null;
	 
		
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
//			for(int i=0;i<ch1.length;i++)
//			{
//				System.out.print(ch1[i]);
//			}
//			System.out.println();
//			for(int i=0;i<ch2.length;i++)
//			{
//				System.out.print(ch2[i]);
//			}
//			for (int i = 0; i < ch1.length; i++) {
//				if (ch1[i] == ch2[i]) {
//					return true;
//				}
			str1 = String.valueOf(ch1);
			str2 = String.valueOf(ch2);
			boolean  b = str1.equals(str2);
			{
				if (b == true)
					return true;
			}
			}
			return false;
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

	/**
	 * @param curr
	 * @param money
	 */
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
	public static int[] toBinary(int num)
	{
		int[] binary=new int[32];
		int i=0;
		while(num>0)
		{
			 binary[i]=num%2;
			 num=num/2;
			 i++;
		}
		return binary;
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
	         last = 
	         middle - 1;
	 
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
	
	//find a number
	public static void findNumber(int first,int last,int middle,int count,int num)
	{
		System.out.println();
		System.out.println("is your number "+middle);
		System.out.println("Enter your answer in 'yes' or 'high' or 'low'");
		String temp=userString();
		do
		{
			if(temp.equals("low"))
			{
				last=middle-1;
				count++;
				middle=(first+last)/2;
				findNumber(first,last,middle,count,num);
				
			}
			else if(temp.equals("high"))
			{
				first=middle+1;
				count++;
				middle=(first+last)/2;
				findNumber(first,last,middle,count,num);
			}
			else 
			{
				System.out.println("your number is "+middle);
				System.out.println("Total number of times it took to find your number is "+(count+1));
				break;
			}
			break;
		}while(first<last);
		
	}
	
	
	//merge sort
	public static void sort(String [] str,int first,int last)
	{
		if(first<last)
		{
			int middle=(first+last)/2;
			sort(str,first,middle);
			sort(str,middle+1,last);
			mergeSort(str,first,middle,last);
		}
//		else
//		{
//			System.out.println("array elements are:");
//			System.out.println(str[first]);
//		}
	}
	public static void mergeSort(String [] str,int first,int middle,int last)
	{
		int n1=middle-first+1;
		int n2=last-middle;
		String [] leftArr=new String[n1];
		String [] rightArr=new String[n2];
		for(int i=0;i<n1;i++)
		{
			leftArr[i]=str[first+i];
		}
		for(int i=0;i<n2;i++)
		{
			rightArr[i]=str[middle+1+i];
		}
		
		 int i = 0, j = 0; 
	     int k = first; 
	     while (i < n1 && j < n2) 
	     { 
	            if (leftArr[i].compareTo(rightArr[j])<=0) 
	            { 
	                str[k] = leftArr[i]; 
	                i++; 
	            } 
	            else
	            { 
	                str[k] = rightArr[j]; 
	                j++; 
	            } 
	            k++; 
	        } 
	  
	        /* Copy remaining elements of L[] if any */
	        while (i < n1) 
	        { 
	            str[k] = leftArr[i]; 
	            i++; 
	            k++; 
	        } 
	  
	        /* Copy remaining elements of R[] if any */
	        while (j < n2) 
	        { 
	            str[k] = rightArr[j]; 
	            j++; 
	            k++; 
	        } 
	}
	public static void printArray(String str[]) 
    { 
        int n = str.length; 
        System.out.println("Sorted elements are:");
        for (int i=0; i<n; ++i) 
            System.out.println(str[i] + " Position: "+i); 
        System.out.println(); 
    } 
			
	//binary
	public static int[] decimalToBinary(int num)
	{
		int[] binary=new int[8];
		int i=0;
		while(num>0)
		{
			 binary[i]=num%2;
			 num=num/2;
			 i++;
		}
		return binary;
	}
	
	public static int [] swapNibble(int first,int middle,int last,int [] binary)
	{
		int n1=middle-first+1;
		int n2=last-middle;
		int [] left_array=new int[n1];
		int [] right_array=new int[n2];
		int [] binary2=new int[8];
		int k=0;
		for(int i=middle+1;i<=last;i++)
		{
			left_array[k]=binary[i];
			k++;
		}
//		for(int j=0;j<left_array.length;j++)
//		{
//			System.out.print(left_array[j]);
//		}
//		System.out.println();
//		System.out.println();
		int l=0;
		for(int i=0;i<=middle;i++)
		{
			right_array[l]=binary[i];
			l++;
		}
//		for(int i=0;i<right_array.length;i++)
//		{
//			System.out.print(right_array[i]);
//		}
		System.out.println();
		int i=0,j=0;
		int m=0;
		while(j<n1)
		{
			binary2[m]=left_array[j];
			j++;
			m++;
		}
		while(i<n2)
		{
			binary2[m]=right_array[i];
			i++;
			m++;
		}
		return binary2;
		
	}
	
	
	public static int decimal(int [] binary)
	{
		int num2=binary.length-1;
		int sum=0;
//		System.out.println(num2);
		for(int i=0;i<binary.length;i++)
		{
			int res=(int)(Math.pow(2, num2));
			sum+=(binary[i]*res);
			num2--;
		}
		return sum;
	}
	
	 public static boolean powerOf2(int number){
		  if(number<=0){
		   return false;
		  }
		  while(number > 1){
		   if(number % 2 != 0){
		    return false;
		   }
		   number = number / 2;
		  }
		  return true;
		 }
}

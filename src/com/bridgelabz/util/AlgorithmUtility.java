/******************************************************************************
 *  Compilation:  javac -d bin AlgorithmUtility.java
 *  Execution:    java -cp bin package com.bridgelabz.functionalprograms.AlgorithmUtility
 *  
 *  Purpose: Algorithm Utility
 *
 *  @author  Naveen Adiga
 *  @version 1.0
 *  @since   22-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.util;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class AlgorithmUtility<E> {

	static Scanner scanner = new Scanner(System.in);

//	public AlgorithmUtility()
//	{
//		scanner=;
//	}

	public static int userInteger() {
//		try {
			return scanner.nextInt();
//		} catch (Exception e) {
//			e.printStackTrace();
//
//		}
//		return 0;

	}

	public static double userDouble() {
//		try {
			return scanner.nextDouble();
//		} catch (Exception e) {
//			e.printStackTrace();
//
//		}
//
//		return 0.0;
	}

	public static boolean userBoolean() {
//		try {
			return scanner.nextBoolean();
//		} catch (Exception e) {
//			e.printStackTrace();
//
//		}
//
//		return false;
	}

	public static String userString() {
//		try {
			return scanner.next();
//		} catch (Exception e) {
//			e.printStackTrace();
//
//		}
//		return null;

	}

	// anagram detection
	/**
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static boolean anagramDetection(String str1, String str2) {
		char[] ch1 = str1.toLowerCase().toCharArray();
		char[] ch2 = str2.toLowerCase().toCharArray();
//		int f = ch1.length - 1;
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
			boolean b = str1.equals(str2);
			{
				if (b == true)
					return true;
			}
		}
		return false;
	}

	// to find range of prime numbers
	/**
	 * @param num
	 * @return
	 */
	public static boolean findPrimeNumber(long num) {
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
	/**
	 * @param str
	 * @return
	 */
	public static String[] sortArray(String str[]) {
		int length = str.length;
		for (int i = 1; i < length; i++) {
			String key = str[i];
			int j = i - 1;
			while (j >= 0 && ((str[j].compareTo(key) > 0))) {
				str[j + 1] = str[j];
				j = j - 1;
			}
			str[j + 1] = key;
		}
		return str;
	}

	// Vending Machine

	/**
	 * @param curr
	 * @param money
	 */
	public static int minChange(int[] curr, int money) {

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
		return temp;

	}

	// Celsius to Fahrenheit:
	/**
	 * @param celsius
	 * @return
	 */
	public static  double tempCToF(double celsius) {
		double temp = (celsius * 9 / 5) + 32;
		return temp;
	}

	// Fahrenheit to Celsius

	/**
	 * @param fahrenheit
	 * @return
	 */
	public static double tempFToC(double fahrenheit) {
		double temp2 = (fahrenheit - 32) * 5 / 9;
		return temp2;
	}

	// monthly payment
	/**
	 * @param p
	 * @param r
	 * @param y
	 * @return
	 */
	public static double payment(double p, double r, double y) {
		double n = 12 * y;
		double t = r / (12 * 100);
		double payment = (p * t) / (1 - Math.pow((1 + t), -n));
		return payment;
	}

	// bubble sort
	/**
	 * @param arr
	 * @param len
	 * @return
	 */
	public static int[] bubbleSort(int[] arr, int len) {
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (arr[i] > arr[j]) {
					swap(i, j, arr);
				}
			}
		}
		return arr;
	}

	/**
	 * @param j
	 * @param k
	 * @param arr
	 */
	public static void swap(int j, int k, int[] arr) {
		int temp;
		temp = arr[j];
		arr[j] = arr[k];
		arr[k] = temp;
	}

	// square root of a number
	/**
	 * @param num
	 * @return
	 */
	public static double sqrt(double num) {
		double t = num;
		double epsilon = 1e-15;
		if (num > 0) {
			while (Math.abs(t - num / t) > (epsilon * t)) {
				t = ((num / t) + t) / 2;
			}
		}
		return t;

	}

	// day of week
	/**
	 * @param month
	 * @param day
	 * @param year
	 * @return
	 */
	public static int dayIs(int month, int day, int year) {
		int year1 = year - (14 - month) / 12;
		int x = year1 + year1 / 4 - year1 / 100 + year1 / 400;
		int month1 = month + 12 * ((14 - month) / 12) - 2;
		int day1 = (day + x + 31 * month1 / 12) % 7;
		return day1;
	}

	// to binary
	/**
	 * @param num
	 * @return
	 */
	public static int[] toBinary(int num) {
		int[] binary = new int[32];
		int i = 0;
		while (num > 0) {
			binary[i] = num % 2;
			num = num / 2;
			i++;
		}
		return binary;
	}

	// binary search

	/**
	 * @param str
	 * @return
	 */
	public static String[] sort(String[] str) {
		int len = str.length;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (str[i].compareTo(str[j]) > 0) {
					String temp;
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		return str;
	}

	/**
	 * @param str
	 * @param key
	 * @return
	 */
	public static int binarySearch(String[] str, String key) {
		// int n=str.length;
		int first = 0;
		int last = str.length - 1;
		int middle = (first + last) / 2;

		while (first <= last) {
			if (str[middle].compareTo(key) < 0)
				first = middle + 1;
			else if (str[middle].compareTo(key) == 0) {
				return middle;
			} else
				last = middle - 1;

			middle = (first + last) / 2;
		}
		return -1;
	}

	// utility class
	/**
	 * @param arr
	 * @return
	 */
	public static int[] sort(int[] arr) {
		int len = arr.length;
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (arr[i] > arr[j]) {
					int temp;
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}

	/**
	 * @param arr
	 * @param key
	 * @return
	 */
	public static int binarySearch(int[] arr, int key) {
		// int n=str.length;
		int first = 0;
		int last = arr.length - 1;
		int middle = (first + last) / 2;

		while (first <= last) {
			if (arr[middle] < key)
				first = middle + 1;
			else if (arr[middle] == key) {
				return middle;
			} else
				last = middle - 1;

			middle = (first + last) / 2;
		}
		return -1;
	}
	
	/**
	 * @return
	 */
	public static double startTime()
	{
		return System.nanoTime();
	}
	/**
	 * @return
	 */
	public static double stopTime()
	{
		return System.nanoTime();
	}
	/**
	 * @param s1
	 * @param s2
	 * @return
	 */
	public static double elapsedTime(double s1,double s2)
	{
		return s2-s1;
	}
//	public static List<Double> listCall(List<Double> timeList)
//	{
//		Collections.sort(timeList);
//		return timeList;
//	}
	/**
	 * @param map
	 * @return
	 */
	public static Map<String,Double> mapCall(Map<String,Double> map)
	{
		Map<String ,Double> sortMap=new LinkedHashMap<>();
		map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
		.forEachOrdered(x -> sortMap.put(x.getKey(), x.getValue()));
		return sortMap;
		
	}
	/**
	 * @param arr
	 * @return
	 */
	public static int[] sortArray(int arr[]) {
		int length = arr.length;
		for (int i = 1; i < length; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && (arr[j] > key)) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		return arr;
	}

	/**
	 * @param str
	 * @param len
	 * @return
	 */
	public static String[] bubbleSort(String[] str, int len) {
		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				if (str[i].compareTo(str[j]) > 0) {
					swap(i, j, str);
				}
			}
		}
		return str;
	}

	/**
	 * @param j
	 * @param k
	 * @param str
	 */
	public static void swap(int j, int k, String[] str) {
		String temp;
		temp = str[j];
		str[j] = str[k];
		str[k] = temp;
	}

	// find a number
	/**
	 * @param first
	 * @param last
	 * @param middle
	 * @param count
	 * @param num
	 */
	public static void findNumber(int first, int last, int middle, int count, int num) {
		System.out.println();
		System.out.println("is your number " + middle);
		System.out.println("Enter your answer in 'yes' or 'high' or 'low'");
		String temp = userString();
		do {
			if (temp.equals("low")) {
				last = middle - 1;
				count++;
				middle = (first + last) / 2;
				findNumber(first, last, middle, count, num);

			} else if (temp.equals("high")) {
				first = middle + 1;
				count++;
				middle = (first + last) / 2;
				findNumber(first, last, middle, count, num);
			} else {
				System.out.println("your number is " + middle);
				System.out.println("Total number of times it took to find your number is " + (count + 1));
				break;
			}
			break;
		} while (first < last);

	}

	// merge sort
	/**
	 * @param str
	 * @param first
	 * @param last
	 */
	public static void sort(String[] str, int first, int last) {
		if (first < last) {
			int middle = (first + last) / 2;
			sort(str, first, middle);
			sort(str, middle + 1, last);
			mergeSort(str, first, middle, last);
		}
//		else
//		{
//			System.out.println("array elements are:");
//			System.out.println(str[first]);
//		}
	}

	/**
	 * @param str
	 * @param first
	 * @param middle
	 * @param last
	 */
	public static void mergeSort(String[] str, int first, int middle, int last) {
		int n1 = middle - first + 1;
		int n2 = last - middle;
		String[] leftArr = new String[n1];
		String[] rightArr = new String[n2];
		for (int i = 0; i < n1; i++) {
			leftArr[i] = str[first + i];
		}
		for (int i = 0; i < n2; i++) {
			rightArr[i] = str[middle + 1 + i];
		}

		int i = 0, j = 0;
		int k = first;
		while (i < n1 && j < n2) {
			if (leftArr[i].compareTo(rightArr[j]) <= 0) {
				str[k] = leftArr[i];
				i++;
			} else {
				str[k] = rightArr[j];
				j++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (i < n1) {
			str[k] = leftArr[i];
			i++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (j < n2) {
			str[k] = rightArr[j];
			j++;
			k++;
		}
	}

	/**
	 * @param str
	 */
	public static void printArray(String str[]) {
		int n = str.length;
		System.out.println("Sorted elements are:");
		for (int i = 0; i < n; ++i)
			System.out.println(str[i] + " Position: " + i);
		System.out.println();
	}

	// binary
	/**
	 * @param num
	 * @return
	 */
	public static int[] decimalToBinary(int num) {
		int[] binary = new int[8];
		int i = 0;
		while (num > 0) {
			binary[i] = num % 2;
			num = num / 2;
			i++;
		}
		return binary;
	}

	/**
	 * @param first
	 * @param middle
	 * @param last
	 * @param binary
	 * @return
	 */
	public static int[] swapNibble(int first, int middle, int last, int[] binary) {
		int n1 = middle - first + 1;
		int n2 = last - middle;
		int[] left_array = new int[n1];
		int[] right_array = new int[n2];
		int[] binary2 = new int[8];
		int k = 0;
		for (int i = middle + 1; i <= last; i++) {
			left_array[k] = binary[i];
			k++;
		}
//		for(int j=0;j<left_array.length;j++)
//		{
//			System.out.print(left_array[j]);
//		}
//		System.out.println();
//		System.out.println();
		int l = 0;
		for (int i = 0; i <= middle; i++) {
			right_array[l] = binary[i];
			l++;
		}
//		for(int i=0;i<right_array.length;i++)
//		{
//			System.out.print(right_array[i]);
//		}
		System.out.println();
		int i = 0, j = 0;
		int m = 0;
		while (j < n1) {
			binary2[m] = left_array[j];
			j++;
			m++;
		}
		while (i < n2) {
			binary2[m] = right_array[i];
			i++;
			m++;
		}
		return binary2;

	}

	/**
	 * @param binary
	 * @return
	 */
	public static int decimal(int[] binary) {
		int num2 = binary.length - 1;
		int sum = 0;
//		System.out.println(num2);
		for (int i = 0; i < binary.length; i++) {
			int res = (int) (Math.pow(2, num2));
			sum += (binary[i] * res);
			num2--;
		}
		return sum;
	}

	/**
	 * @param number
	 * @return
	 */
	public static boolean powerOf2(int number) {
		if (number <= 0) {
			return false;
		}
		while (number > 1) {
			if (number % 2 != 0) {
				return false;
			}
			number = number / 2;
		}
		return true;
	}
	// Prime number which are anagram and palindrome

	/**
	 * @param num
	 * @return
	 */
	public static List<Integer> findPrime(int num) {
		int flag = 1;
		int i;
		List<Integer> arr = new ArrayList<>();
//		int count = 0;
		for (i = 2; i <= num; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = 0;
					break;
				} else
					flag = 1;
			}
			if (flag == 1) {
				arr.add(i);
			}
		}
		System.out.println(arr);
		return arr;
	}

	/**
	 * @param primeList
	 * @return
	 */
	public static Set<Integer> primeAnagram(List<Integer> primeList) {
		Set<Integer> primeAnagramSet = new HashSet<>();
		for (int i = 0; i < primeList.size(); i++) {
			for (int j = i + 1; j < primeList.size(); j++) {
				if (anagramDetection(String.valueOf(primeList.get(i)), String.valueOf(primeList.get(j)))) {
					// primeAnagramList.add(Integer.toString(i));
					primeAnagramSet.add(primeList.get(i));
					primeAnagramSet.add(primeList.get(j));
					System.out.println(primeList.get(i) + "    " + primeList.get(j));
				}
			}
		}
		return primeAnagramSet;
	}

	/**
	 * @param primeAnagramSet
	 * @return
	 */
	public static Set<Integer> primePalindrome(Set<Integer> primeAnagramSet) {
		Iterator<Integer> iter = primeAnagramSet.iterator();
		Set<Integer> resultSet = new HashSet<>();
		while (iter.hasNext()) {
			Integer a1 = (Integer) iter.next();
			Integer lk = reverse(a1);
			if (primeAnagramSet.contains(lk))

			{
				resultSet.add(lk);
			}
		}
		return resultSet;
	}

	/**
	 * @param n
	 * @return
	 */
	public static Integer reverse(Integer n) {
		Integer reverse = 0;
		while (n != 0) {
			reverse = reverse * 10;
			reverse = reverse + n % 10;
			n = n / 10;
		}
		return reverse;
	}

}

/******************************************************************************
 *  Compilation:  javac -d bin AlgorithmUtility.java
 *  Execution:    java -cp bin package com.bridgelabz.functionalprograms.AlgorithmUtility
 *  
 *  Purpose:Contains all the functions for the .java files in 
 *  		 com.bridgelabz.algorithmprogram package
 *
 *  @author  Naveen Adiga
 *  @version 1.0
 *  @since   22-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.util;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class AlgorithmUtility<E> {

	/**
	 * static object is created for Scanner class to avoid multiple object creations
	 * of the same class.
	 */

	static Scanner scanner = new Scanner(System.in);

	/**
	 * static function to read integers input from the user
	 * 
	 * @return integer values that are read
	 */

	public static int userInteger() {

		return scanner.nextInt();

	}

	/**
	 * static function to read double input from the user
	 * 
	 * @return double values that are read
	 */
	public static double userDouble() {

		return scanner.nextDouble();

	}

	/**
	 * static function to read boolean input from the user
	 * 
	 * @return boolean values that are read
	 */
	public static boolean userBoolean() {

		return scanner.nextBoolean();

	}

	/**
	 * static function to read string input from the user
	 * 
	 * @return strings that are read
	 */
	public static String userString() {
		return scanner.next();

	}

	// anagram detection
	/**
	 * Static function to check if the two strings are anagram or not.
	 * 
	 * @param str1 the string to be checked for anagram
	 * @param str2 the string to be checked for anagram
	 * @return true if the strings are anagram else false
	 */
	public static boolean anagramDetection(String str1, String str2) {
		char[] ch1 = str1.toLowerCase().toCharArray();
		char[] ch2 = str2.toLowerCase().toCharArray();
		if (ch1.length != ch2.length) {
			return false;
		} else {
			ch1=sortChar(ch1);
			System.out.println();
			ch2=sortChar(ch2);
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
    /**
     * static method is used to sort array of characters
     * @param ch is the character array
     * @return sorted character array
     */
    public static char[] sortChar(char [] ch)
    {
    	char [] b=new char[ch.length];
    	for(int i=0;i<ch.length;i++)
    	{ 
    		int count=0;
    		for(int j=0;j<ch.length;j++)
    		{
    			if(ch[i]<ch[j])
    			{
    				count++;
    			}
    		}
    		b[count]=ch[i];
    	}
    	return b;
    }
	// to find range of prime numbers
	/**
	 * static function to print the prime numbers for the given range
	 * 
	 * @param num the integer that represents the range
	 * @return integers that are prime numbers between the range
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
	 * static function to sort the given array of strings using insertion sort
	 * 
	 * @param array the array of strings that is to be sorted
	 * @return array the array of strings that are sorted
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
	 * 
	 * @param curr  the array of possible notes in integers
	 * @param money the amount that you need change for
	 * @return integer the minimum changes needed for the amount entered
	 */
	public static int minChange(int[] curr, int money) {

		int cash = money;
		int temp = 0;
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
	 * static function that converts given temperature from celcius to fahrenheit
	 * 
	 * @param celsius the choice to which temperature the user wants to convert to
	 * @return temperature that is converted
	 */
	public static double tempCToF(double celsius) {
		double temp = (celsius * 9 / 5) + 32;
		return temp;
	}

	// Fahrenheit to Celsius

	/**
	 * static function that converts given temperature from fahrenheit to celsius
	 * 
	 * @param celsius the choice to which temperature the user wants to convert to
	 * @return temperature that is converted
	 */
	public static double tempFToC(double fahrenheit) {
		double temp2 = (fahrenheit - 32) * 5 / 9;
		return temp2;
	}

	// monthly payment
	/**
	 * static function that calculates the monthly payment
	 * 
	 * @param principle the principle amount taken loan
	 * @param year      the years to pay off
	 * @param rate      the interest rate
	 * @return monthly payment
	 */
	public static double payment(double p, double r, double y) {
		double n = 12 * y;
		double t = r / (12 * 100);
		double payment = (p * t) / (1 - Math.pow((1 + t), -n));
		return payment;
	}

	// bubble sort
	/**
	 * static function to sort the array using bubble sort algorithm
	 * 
	 * @param array the array of integers that is to be sorted
	 * @param len   the number of integers in the array
	 * @return integer array the array that is sorted
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
	 * static function that calculates the square root of a given number
	 * 
	 * @param num the number whose square root is to be found
	 * @return absolute value
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
	 * static function that finds the day of the week provided date
	 * 
	 * @param month the numeric representation the of month
	 * @param date  the numeric representation the of date
	 * @param year  the numeric representation the of year
	 * @return integer the numeric representation of the day
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
	 * static function that converts decimal to binary
	 * 
	 * @param num the number that is to be converted to binary
	 * @return array the array of integers that contains binary bits of the number
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
	 * static function that sorts the given array using bubble sort algorithm
	 * 
	 * @param array the array of strings to be sorted
	 * @return sorted array
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
	 * static function that search for the given key in a array using binary search
	 * algorithm
	 * 
	 * @param array the array of strings from which key is to be found
	 * @param key   the key to be searched in the array
	 * @return index the index of the key, found in the array
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
	 * static function that sorts the given array using bubble sort algorithm
	 * 
	 * @param array the array of integers or strings to be sorted
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
	 * static function that search for the given key in a array using binary search
	 * algorithm
	 * 
	 * @param array the array of integers from which key is to be found
	 * @param key   the key to be searched in the array
	 * @return index the index of the key, found in the array
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
	 * to find start time
	 * 
	 * @return
	 */
	public static double startTime() {
		return System.nanoTime();
	}

	/**
	 * to find stop time
	 * 
	 * @return
	 */
	public static double stopTime() {
		return System.nanoTime();
	}

	/**
	 * to find the elapsed time
	 * 
	 * @param s1
	 * @param s2
	 * @return
	 */
	public static double elapsedTime(double s1, double s2) {
		return s2 - s1;
	}

	/**
	 * 
	 * @param elapsed_time the map that contains [key, pair] values that represents
	 *                     algorithm and its elapsed time respectively.
	 * @return map that contains the sorted map of [key,pair] values that are sorted
	 *         by values
	 */
	public static Map<String, Double> mapCall(Map<String, Double> map) {
		Map<String, Double> sortMap = new LinkedHashMap<>();
		map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.forEachOrdered(x -> sortMap.put(x.getKey(), x.getValue()));
		return sortMap;

	}

	/**
	 * static function that sorts the given array using insertion sort
	 * 
	 * @param array the array of integers or strings that is to be sorted
	 * @return the number of integers to be sorted
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
	 * static function that sorts the given array using bubble sort algorithm
	 * 
	 * @param array the array of integers or strings to be sorted
	 * @param len   of the array
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
	 * swaping the elements of array of strings
	 * 
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
	 * static function that finds the number N that is guessed between the range of
	 * numbers such that the range is 2 to the power of N
	 * 
	 * @param first  the lower bound among the range of the numbers
	 * @param last   the upper bound among the range of the numbers
	 * @param middle the upper bound among the range of the numbers
	 * @param count  the upper bound among the range of the numbers
	 * @param num    the upper bound among the range of the numbers
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
	 * static function that sorts the given array using merge sort algorithm
	 * 
	 * @param first  the lower bound of the array
	 * @param middle the higher bound of the array
	 * @param last   the higher bound of the array
	 * @return
	 */
	public static void sort(String[] str, int first, int last) {
		if (first < last) {
			int middle = (first + last) / 2;
			sort(str, first, middle);
			sort(str, middle + 1, last);
			mergeSort(str, first, middle, last);
		}
	}

	/**
	 * static function to merge the sorted arrays obtained from the merge function.
	 * 
	 * @param array  the array of strings that are needed to be sorted
	 * @param first  the lower bound of the array
	 * @param middle the higher bound of the array
	 * @param last   the higher bound of the array
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
	 * static function that is used to print the array
	 * 
	 * @param array the array to be printed
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
	 * static method to covert decimal number to binary
	 * 
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
	 * static function that used to swap nibble of a byte
	 * 
	 * @param first  elements of array
	 * @param middle elements of array
	 * @param last   elements of array
	 * @param binary array
	 * @return integer integer that is swapped
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

		int l = 0;
		for (int i = 0; i <= middle; i++) {
			right_array[l] = binary[i];
			l++;
		}

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
	 * static method is used to convert binary to decimal
	 * 
	 * @param binary array
	 * @return decimal number
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
	 * static method is used to find factorial of 2
	 * 
	 * @param number find the factor of it
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
	 * static function to print the prime numbers for the given range
	 * 
	 * @param num the integer that represents the range
	 * @return list of integers that are prime numbers between the range
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
	 * static function that is used to add prime numbers that are anagram
	 * 
	 * @param new_lst the list of prime numbers
	 * @return set of prime numbers that are anagram
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
	 * static function that is used to add prime numbers that are anagram and
	 * palindrom
	 * 
	 * @param primeAnagramset the set of prime numbers that are anagram
	 * @return set the set of prime numbers that are anagram and palindrom
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
	 * this static method is used to reverse integer
	 * 
	 * @param n integer number
	 * @return reverse number
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

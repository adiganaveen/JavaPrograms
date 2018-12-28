/******************************************************************************
 *  Compilation:  javac -d bin FunctionalUtility.java
 *  Execution:    java -cp bin package com.bridgelabz.functionalprograms.FunctionalUtility
 *  
 *  Purpose: Contains all the functions for the .java files in 
 *  		 com.bridgelabz.functionalprogram package
 *
 *  @author  Naveen Adiga
 *  @version 1.0
 *  @since   18-12-2018
 *
 ******************************************************************************/
package com.bridgelabz.util;

import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FunctionalUtility<E> {

	// replace_string
	/**
	 * static function that is used to replace a string in a given template
	 * 
	 * @param str the string template whose substring is to be replaced
	 * 			  with the another string
	 * @param uname the string with which the string in the template
	 * 		  is replaced
	 * @return string the string template that is modified.
	 */
	public static String replaceString(String str, String uname) {
		String message;
		final String REGEX_NAME = "<<UserName>>";
		Pattern p = Pattern.compile(REGEX_NAME);
		Matcher m = p.matcher(str);
		message = m.replaceAll(uname);
		return message;
//			String str2 = str.replace("<<UserName>>", uname);
//			return str2;
	}

	/**
	 *  static function to check if the given year is a leap year or not
	 * 
	 * @param year the year to be checked whether it is a leap year or not
	 * @return true if leap year else false
	 */
	public static boolean leapYear(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return true;
		} else
			return false;
	}

	// flip_coin_percentage_head_or_tail
	/**
	 * static function to find the head vs tail percentage after 
	 * flipping the coin n times
	 * 
	 * @param n the number of times to flip a coin
	 */
	public static void flipCoin(int num) {
		int headcount = 0, tailcount = 0;
		int n = num;
		while (n > 0) {

			if (Math.random() < 0.5)
				headcount++;
			else
				tailcount++;
			n--;
		}
		System.out.println(
				"percentage of head is " + headcount * 100 / num + " & percentage of tail is " + tailcount * 100 / num);

	}

	// power of a value
	/**
	 * static function to print all the values of the 2 power of N
	 * 
	 * @param a is the base value
	 * @param b is the exponent value
	 */
	public static double pow(double a, double b) {
		int i = 0;
		int power = 1;
		while (i <= b) {
			System.out.println("2^" + i + " = " + power);
			power = power * 2;
			i++;
		}
		double c = Math.pow(a, b);
		return c;
	}

	// harmonicvalue
	/**
	 * static is used to find harmonic value of a number
	 * @param n value to find harmonic
	 * @return sum of it
	 */
	public static double harmonicValue(int n) {
		double sum = 0.0;
		if (n < 1)
			return 2;
		else
			for (double i = 1; i <= n; i++) {
				sum += (1 / i);
			}
		return sum;
	}

	/*
	 * public void factorial(int n) { int[] a=new int[n/2]; int[] b=null; for(int
	 * i=1;i<=n/2;i++) { if(n%i==0) { } } }
	 */

	// primefactors
	/**
	 * static method to find the prime factors
	 * 
	 * @param n the number whose prime factors are to be found
	 */
	public static void primeFactors(int n) {
		while (n % 2 == 0) {
			System.out.print(2 + " ");
			n /= 2;
		}
		for (int i = 3; i * i <= n; i += 2) {
			while (n % i == 0) {
				System.out.print(i + " ");
				n /= i;
			}
		}
		if (n > 2)
			System.out.print(n);
	}

	// gambling
	/**
	 * static function to gamble 
	 * 
	 * @param stake the amount that is at stake
	 * @param goal the amount to be obtained
	 * @param chance the number of times gambled
	 */
	public static void gambleing(int stack, int goal, int chance) {
		int win = 0, loss = 0;
		// int bets = 0;
		// int trail = chance;
		for (int i = 0; i < chance; i++) {
			int cash = stack;
			while (cash > 0 && cash < goal) {
				// bets++;
				if (Math.random() < 0.5) {
					cash--;
				} else {
					cash++;
				}
			}
			if (cash == goal)
				win++;
			else
				loss++;
		}
		System.out.println(win + ":" + loss + ":" + chance);
		System.out.println("win percentage is " + win * 100 / chance);
		System.out.println("loss percentage is " + loss * 100 / chance);
		// System.out.println("average wins is "+bets*100/trail);
	}

	// Coupon_number
	/**
	 * static function to generate distinct coupon numbers
	 * 
	 * @param num the number of coupon numbers to be generated
	 * @return the count of random numbers of generated to obtain 
	 * 			distinct coupon numbers
	 */
	public static int collect(int n) {
		int[] couponBox = new int[n];
		int count = 0;
		int distinct = 0;
		while (distinct < n) {
			int value = (int) (Math.random() * n);
			count++;
			if (couponBox[value] == 0) {
				distinct++;
				System.out.println(distinct);
				couponBox[value] = 1;
			}
		}
		return count;
	}

	// Sum of 3 integer equal to zero
	/**
	 * static function to obtain triplet integers that gives 0 upon addition
	 * 
	 * @param arr integers in an array
	 * @param length of the array
	 */
	public static void sumOfInterger(int[] arr, int n) {
		boolean found = false;
		int count = 0;
		System.out.println("The posibilities are :");
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						System.out.print(arr[i] + "+" + arr[j] + "+" + arr[k] + "=0");
						count++;
						found = true;
					}
				}
			}
			System.out.println();
		}
		System.out.println("total number of possibilities are :" + count);
		if (found == false) {
			System.out.println("sum of three intergers does not add up to zero");
		}
	}

	// 2d array

	// insertion on integer array
	/**
	 * static method is used to enter the values onto array
	 * @param row value
	 * @param column value
	 * @return integer array
	 */
	public static Integer[][] arrayInt(int row, int column) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Integer[][] integerArray = new Integer[row][column];
		System.out.println("enter integer array elements");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.println("Row [" + i + "]:  Column [" + j + "] :");
				integerArray[i][j] = sc.nextInt();
			}
		}
		return integerArray;
	}

	

	// insertion of double array
	/**
	 * static method is used to enter the values onto array
	 * @param row value
	 * @param column value
	 * @return double array
	 */
	public Double[][] arrayDouble(int row, int column) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Double[][] integerArray = new Double[row][column];
		System.out.println("enter double array elements");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.println("Row [" + i + "]:  Column [" + j + "] :");
				integerArray[i][j] = sc.nextDouble();
			}
		}
		return integerArray;
	}

	// insertion of boolean array
	/**
	 * static method is used to enter the values onto array
	 * @param row value 
	 * @param column value
	 * @return boolean array 
	 */
	public Boolean[][] arrayBoolean(int row, int column) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Boolean[][] integerArray = new Boolean[row][column];
		System.out.println("enter boolean array elements");
		System.out.println("select the number 1 or 0");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.println("Row [" + i + "]:  Column [" + j + "] :");
				integerArray[i][j] = sc.nextBoolean();
			}
		}
		return integerArray;
	}

	/**
	 * static generic method to display the generic array using printwritter
	 * @param genericArray
	 * @param row value
	 * @param column value
	 */
	public void display(E[][] genericArray, int row, int column) {
		PrintWriter pw = new PrintWriter(System.out, true);
		System.out.println("The matrix form is ");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				pw.print("\t" + genericArray[i][j] + " ");
			}
			pw.println();
		}
	}

	// distance
	/**
	 * static function that calculates the distance between the
	 * two points (x,y)
	 * 
	 * @param x the integer that represents a point
	 * @param y the integer that represents a point 
	 * @return distance the distance between the two points
	 */
	public static double getDistance(int x, int y) {
		double result = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		return result;
	}

	// to find roots
	/**
	 * static function that is used to find the roots of a 
	 * given quadratic equation 
	 * 
	 * @param a the number of x*x
	 * @param b the number of x
	 * @param c the constant of the equation
	 */
	public static void rootsValue(int a, int b, int c) {
		double delta = (b * b) - (4 * a * c);
		if (delta >= 0) {
			double d = Math.sqrt(delta);
			double root1 = (-b + d) / (2 * a);
			double root2 = (-b - d) / (2 * a);
			System.out.println("Root 1 of x is " + root1);
			System.out.println("Root 2 of x is " + root2);
		} else {
			System.out.println("It is imaginary number ");
		}

	}

	// simulate stop watch
	/**
	 * index stores the startTime
	 */
	static long startTime = 0;
	/**
	 * index stores stopTime
	 */
	static long stopTime = 0;
	/**
	 * index stores difference time
	 */
	static long diffTime = 0;

	/**
	 * static method is used to find start time
	 */
	public static void start(int start) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		System.out.println(sdf.format(cal.getTime()));
		startTime = System.currentTimeMillis();
		System.out.println("The start time is " + startTime);
	}

	/**
	 * static method is used to find stop time
	 */
	public static void stop(int stop) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		System.out.println(sdf.format(cal.getTime()));
		stopTime = System.currentTimeMillis();
		System.out.println("The stop time is " + stopTime);
	}

	/**
	 * static method is used to find differential time
	 */
	public static long differentialTime(int diffTime) {
		long time = stopTime - startTime;
		// diffTime=startTime-stopTime;
		// return diffTime;
		return time;
	}

	// wind chill
	/**
	 * static function that calculates the efficient temperature 
	 * 
	 * @param temp the temperature
	 * @param wind_speed the speed of the wind
	 * @return efficient temperature calculated
	 */
	public static double calcWindChill(double t, double v) {
		double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
		return w;
	}

	// recursive combination
	/**
	 * static method is used to possible recursion we can do it for a string 
	 * @param str string value
	 * @param initial first element
	 * @param last element 
	 * @param array list
	 * @return array list
	 */
	public static List<String> recursion(String str, int initial, int last,List<String> arr) {
		
		if (initial == last) {
			arr.add(str);
		} else {
			for (int i = initial; i < last; i++) {
				str = swap(str, initial, i);
				recursion(str, (initial + 1), last,arr);
//				str = swap(str, initial, i);
			}
		}
		return arr;
	}

	/**
	 * static method is used to swap the string alphabets
	 * @param str string value
	 * @param i index of string
	 * @param j index of string
	 * @return String
	 */
	public static String swap(String str, int i, int j) {
		char temp;
		char[] ch = str.toCharArray();
		temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
		return String.valueOf(ch);

	}

	/**
	 * static method is used to possible iterations we can do it for a string 
	 * @param s is the string value
	 * @return arr array of string
	 */
	public static List<String> iteration(String str) {
		List<String> arr = new ArrayList<>();
		arr.add(String.valueOf(str.charAt(0)));
		for (int i = 1; i < str.length(); i++) {
			for (int j = arr.size() - 1; j >= 0; j--) {
				String s = arr.remove(j);
				for (int k = 0; k <= s.length(); k++) {
					arr.add(s.substring(0, k) + str.charAt(i) + s.substring(k));
				}
			}
		}
		return arr;
	}
	
	/**
	 * static method is used to sort the array list
	 * @param arr is arraylist
	 * @return arraylist 
	 */
	public static List<String> listSort(List<String> arr)
	{
		Collections.sort(arr);
		return arr;
	}

	// tic tack toe
	
}
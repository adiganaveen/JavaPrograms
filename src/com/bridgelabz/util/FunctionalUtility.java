/******************************************************************************
 *  Compilation:  javac -d bin FunctionalUtility.java
 *  Execution:    java -cp bin package com.bridgelabz.functionalprograms.FunctionalUtility
 *  
 *  Purpose: Functional utility
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

import java.util.Scanner;

public class FunctionalUtility<E> {

	// replace_string
	/**
	 * @param str
	 * @param uname
	 */
	public static String replaceString(String str, String uname) {
			String str2 = str.replace("<<UserName>>", uname);
			return str2;
	}

	/**
	 * @param year
	 */
	public static boolean leapYear(int year) {
			if (year % 4 == 0 && year % 100 != 0 ||year % 400 == 0)  {
				return true;
			} else
				return false;
	}

	// flip_coin_percentage_head_or_tail
	/**
	 * @param num
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
	 * @param a
	 * @param b
	 */
	public static double pow(double a, double b) {
		double c = Math.pow(a, b);
		return c;
	}

	// harmonicvalue
	/**
	 * @param n
	 * @return
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
	 * @param n
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
	 * @param stack
	 * @param goal
	 * @param chance
	 */
	public static void gambleing(int stack, int goal, int chance) {
		int win = 0, loss = 0;
		// int bets = 0;
		//int trail = chance;
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
	 * @param n
	 * @return
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
	 * @param arr
	 * @param n
	 */
	public static void sumOfInterger(int[] arr, int n) {
		boolean found = false;
		System.out.println("The posibilities are :");
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						System.out.print(arr[i] + "+" + arr[j] + "+" + arr[k] + "=0");
						found = true;
					}
					System.out.println();
				}
			}
		}
		if (found == false) {
			System.out.println("sum of three intergers does not add up to zero");
		}
	}

	// 2d array

	// insertion on integer array
	/**
	 * @param row
	 * @param column
	 * @return
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

	// printing the array using printwriter
	// public void display(int[][] arr1, double[][] arr2, boolean[][] arr3, int
	// row, int column) {
	// PrintWriter pw = new PrintWriter(System.out, true);
	// pw.println("Array of integer");
	// for (int i = 0; i < row; i++) {
	// for (int j = 0; j < column; j++) {
	// pw.print(arr1[i][j] + " ");
	// }
	// pw.println();
	// }
	// pw.println("Array of double");
	// for (int i = 0; i < row; i++) {
	// for (int j = 0; j < column; j++) {
	// pw.print(arr2[i][j] + " ");
	// }
	// pw.println();
	// }
	// pw.println("Array of boolean");
	// for (int i = 0; i < row; i++) {
	// for (int j = 0; j < column; j++) {
	// pw.print(arr3[i][j] + " ");
	// }
	// pw.println();
	// }
	// }

	// insertion of double array
	/**
	 * @param row
	 * @param column
	 * @return
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
	 * @param row
	 * @param column
	 * @return
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
	 * @param genericArray
	 * @param row
	 * @param column
	 */
	public void display(E[][] genericArray,int row ,int column) {
		PrintWriter pw = new PrintWriter(System.out, true);
		System.out.println("The matrix form is ");
		for (int i = 0; i <row; i++) {
			for (int j = 0; j < column; j++) {
				pw.print("\t" + genericArray[i][j] + " ");
			}
			pw.println();
		}
	}

	// distance
	/**
	 * @param x
	 * @param y
	 * @return
	 */
	public static double getDistance(int x, int y) {
		double result = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		return result;
	}

	// to find roots
	/**
	 * @param a
	 * @param b
	 * @param c
	 */
	public static void rootsValue(int a, int b, int c) {
		double delta = (b * b) - (4 * a * c);
		double d = Math.sqrt(delta);
		double root1 = (-b + d) / (2 * a);
		double root2 = (-b - d) / (2 * a);
		System.out.println("Root 1 of x is " + root1);
		System.out.println("Root 2 of x is " + root2);

	}

	// simulate stop watch
	static long startTime = 0;
	static long stopTime = 0;
	static long diffTime = 0;

	/**
	 * 
	 */
	public static void start(int start) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		System.out.println(sdf.format(cal.getTime()));
		startTime = System.currentTimeMillis();
		System.out.println("The start time is " + startTime);
	}

	/**
	 * 
	 */
	public static void stop(int stop) {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		System.out.println(sdf.format(cal.getTime()));
		stopTime = System.currentTimeMillis();
		System.out.println("The stop time is " + stopTime);
	}

	/**
	 * 
	 */
	public static long differentialTime(int diffTime) {
		long time = stopTime - startTime;
		// diffTime=startTime-stopTime;
		// return diffTime;
		return time;
	}

	// wind chill
	/**
	 * @param t
	 * @param v
	 * @return
	 */
	public static double calcWindChill(double t, double v) {
		double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
		return w;
	}
	
	
	//recursive combination
	/**
	 * @param str
	 * @param initial
	 * @param last
	 */
	public static void recursion(String str,int initial,int last)
	{
		if(initial==last)
		{
			System.out.println(str);
		}
		else
		{
			for(int i=initial;i<last;i++)
			{
				str = swap(str,initial,i); 
                recursion(str, (initial+1), last);
                str = swap(str,initial,i); 
        
			}
		}
	}

	/**
	 * @param s
	 */
	public static void iteration(String s)
	{
		// create an empty ArrayList to store (partial) permutations
		ArrayList<String> arr = new ArrayList<>();

		// initialize the list with the first character of the string
		arr.add(String.valueOf(s.charAt(0)));

		// do for every character of the specified string
		for (int i = 1; i < s.length(); i++)
		{
			// consider previously constructed partial permutation one by one

			// (iterate backwards to avoid ConcurrentModificationException)
			for (int j = arr.size() - 1; j >= 0 ; j--)
			{
				// remove current partial permutation from the ArrayList
				String str = arr.remove(j);

				// Insert next character of the specified string in all
				// possible positions of current partial permutation. Then
				// insert each of these newly constructed string in the list

				for (int k = 0; k <= str.length(); k++)
				{
					// Advice: use StringBuilder for concatenation
					arr.add(str.substring(0, k) + s.charAt(i) +
								str.substring(k));
				}
			}
		}

		System.out.println(arr);
	}
	
	/**
	 * @param str
	 * @param i
	 * @param j
	 * @return
	 */
	public static String swap(String str,int i,int j)
	{
		char temp;
		char [] ch=str.toCharArray();
		temp=ch[i];
		ch[i]=ch[j];
		ch[j]=temp;
		return String.valueOf(ch);
		
	}

	//tic tack toe
	static int player = 0;
	static int[][] BOARD = new int[3][3];
	static boolean isEmpty = true;

	/**
	 * 
	 */
	public static void initBoard() {
		System.out.println("TIC TAC TOE GAME\nComputer is o\nPlayer  is x ");
		for (int i = 0; i < BOARD.length; i++) {
			for (int j = 0; j < BOARD[i].length; j++) {
				BOARD[i][j] = -10;
			}
		}
		System.out.println("Board is this :");
		dispBoard();
	}

	public static void dispBoard() {
		int count = 0;
		for (int i = 0; i < BOARD.length; i++) {
			System.out.println("---------------");
			System.out.print("||");
			for (int j = 0; j < BOARD[i].length; j++) {
				if (BOARD[i][j] == 0) {
					count++;
					System.out.print(" o ||");
				} else if (BOARD[i][j] == 1) {
					count++;
					System.out.print(" x ||");
				} else
					System.out.print("   ||");
			}
			System.out.println(" ");
		}
		if (count == 9) {
			isEmpty = false;
		}
		System.out.println("---------------");
	}
	/*
	 * static void putVal(int i, int j, int player) { if if (player % 2 == 0) {
	 * BOARD[i][j] = 0; } else BOARD[i][j] = 1; }
	 */

	public static void putVal() {
		int i;
		int j;
		if (player % 2 == 1) {
			i = (int) (Math.random() * 10) % 3;
			j = (int) (Math.random() * 10) % 3;
		} else {
			@SuppressWarnings("resource")
			Scanner s = new Scanner(System.in);
			System.out.println("enter value of x and y by space");
			i = s.nextInt();
			j = s.nextInt();
		}
		if (BOARD[i][j] == -10) {
			if (player % 2 == 0) {
				BOARD[i][j] = 0;
			} else {
				BOARD[i][j] = 1;
				System.out.println("Coumputer Choosing " + i + " " + j);
			}
		} else
			putVal();
		

	}

	public static boolean win() {
		return ((BOARD[0][0] + BOARD[0][1] + BOARD[0][2] == player * 3)
				|| (BOARD[1][0] + BOARD[1][1] + BOARD[1][2] == player * 3)
				|| (BOARD[2][0] + BOARD[2][1] + BOARD[2][2] == player * 3)
				|| (BOARD[0][0] + BOARD[1][0] + BOARD[2][0] == player * 3)
				|| (BOARD[0][1] + BOARD[1][1] + BOARD[2][1] == player * 3)
				|| (BOARD[0][2] + BOARD[1][2] + BOARD[2][2] == player * 3)
				|| (BOARD[0][0] + BOARD[1][1] + BOARD[2][2] == player * 3)
				|| (BOARD[2][0] + BOARD[1][1] + BOARD[0][2] == player * 3));
	}

	public static void play() {
		initBoard();
		while (isEmpty) {
			System.out.println("Players turn");
			putVal();
			dispBoard();
			if (win()) {
				System.out.println("Player won");
				return;
			}
			player = 1;
			System.out.println("Computers turn");
			putVal();
			dispBoard();
			if (win()) {
				System.out.println("Computer won");
				return;
			}
			player = 0;
		}
	}
}
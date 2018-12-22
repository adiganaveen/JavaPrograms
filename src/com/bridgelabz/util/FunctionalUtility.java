//It is functional utility class
/*Naveen Adiga
  18/12/2018
 */

package com.bridgelabz.util;


import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Scanner;

public class FunctionalUtility<E> {

	// replace_string
	public void replaceString(String str, String uname) {
		if (uname.length() < 3) {
			System.out.println("enter a name greater than 3 alphabets");
		} else {
			String str2 = str.replace("<<UserName>>", uname);
			System.out.println(str2);
		}
	}

	// leap_year
	public void leapYear(int year) {
		if (Integer.toString(year).length() != 4) {
			System.out.println("please enter the valid 4 digit year");
		} else {
			if (year % 4 == 0 && year % 100 != 0 ||year % 400 == 0)  {
				System.out.println(year + "is a leap year");
			} else
				System.out.println(year + "not a leap year");
		}
	}

	// flip_coin_percentage_head_or_tail
	public void flipCoin(int num) {
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
	public void pow(double a, double b) {
		double c = Math.pow(a, b);
		System.out.println("value of 2 power " + b + " is " + c);
	}

	// harmonicvalue
	public double harmonicValue(int n) {
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
	public void primeFactors(int n) {
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
	public void gambleing(int stack, int goal, int chance) {
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
	public void sumOfInterger(int[] arr, int n) {
		boolean found = false;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						System.out.println("The posibilities are :");
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
	public Integer[][] arrayInt(int row, int column) {
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
	public Double[][] arrayDouble(int row, int column) {
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
	public Boolean[][] arrayBoolean(int row, int column) {
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
	public double getDistance(int x, int y) {
		double result = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		return result;
	}

	// to find roots
	public void rootsValue(int a, int b, int c) {
		double delta = (b * b) - (4 * a * c);
		double d = Math.sqrt(delta);
		double root1 = (-b + d) / (2 * a);
		double root2 = (-b - d) / (2 * a);
		System.out.println("Root 1 of x is " + root1);
		System.out.println("Root 2 of x is " + root2);

	}

	// simulate stop watch
	private long startTime = 0;
	long stopTime = 0;
	long diffTime = 0;

	public void start() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		System.out.println(sdf.format(cal.getTime()));
		startTime = System.currentTimeMillis();
		System.out.println("The start time is " + startTime);
	}

	public void stop() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		System.out.println(sdf.format(cal.getTime()));
		stopTime = System.currentTimeMillis();
		System.out.println("The stop time is " + stopTime);
	}

	public void differentialTime() {
		long time = stopTime - startTime;
		// diffTime=startTime-stopTime;
		// return diffTime;
		System.out.println("Time of stopwatch is : " + time + "millisec");
		System.out.println("Time of stopwatch is : " + (time / 1000) + "sec");
		System.out.println("Time in minutes is : " + (time / 60000) + "mins");
	}

	// wind chill
	public double calcWindChill(double t, double v) {
		double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
		return w;
	}
	
	
	//recursive combination
	public void recursion(String str,int initial,int last)
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
//	public void iteration(String str,int num)
//	{
//		String str2="";
//		int fact=1;
//		for(int i=1;i<=num;i++)
//		{
//			fact= fact*i;
//		}
//		while(fact>0)
//		{
//		for(int i=0;i<num;i++)
//		{
//			for(int j=i;j<num;j++)
//			{
//			str2=swap(str,i,j);
//			System.out.println(str2);
//			
//			}
//			
//		}
//		fact--;
//		}
//		}
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
	
	public String swap(String str,int i,int j)
	{
		char temp;
		char [] ch=str.toCharArray();
		temp=ch[i];
		ch[i]=ch[j];
		ch[j]=temp;
		return String.valueOf(ch);
		
	}

}
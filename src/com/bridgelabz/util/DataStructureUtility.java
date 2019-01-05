package com.bridgelabz.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class DataStructureUtility {

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

	static BufferedReader br;

	public String getFileText(String fileName) {
		try {
			br = new BufferedReader(new FileReader(fileName));
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();
			while (line != null) {
				sb.append(line);
				sb.append(System.lineSeparator());
				line = br.readLine();
			}
			return sb.toString();
		} catch (Exception e) {
			return null;
		} finally {
			try {
				br.close();
			} catch (Exception E) {
				E.printStackTrace();
			}
		}
	}

	public void writeToFile(String data, String fileName) throws Exception {
		File file = new File(fileName);
		if (!file.exists()) {
			file.createNewFile();
		}
		FileWriter writer = new FileWriter(file);
		// Writes the content to the file
		writer.write(data);
		writer.flush();
		writer.close();
	}

	public static double binomialCoeff(double n, double k) {
		int res = 1;
//	    if (k > n - k) 
//	        k = n - k;  
		for (int i = 0; i < k; ++i) {
			res *= (n - i);
			res /= (i + 1);
		}
		return res;
	}

	public static double countBinary(double n) {
		double c = binomialCoeff(2 * n, n);
		double count = c / (n + 1);
		return count;
	}
	//calender
	public static int day(int month, int i, int year)
	{ 
	int y = year - (14 - month) / 12;
	int x = y + y/4 - y/100 + y/400;
	int m = month + 12 * ((14 - month) / 12) - 2;
	int d = (i + x + (31*m)/12) % 7;
	return d;
	}
	
	public static boolean isLeapYear(int year)
	{
	        if  (((year % 4 == 0) && (year % 100 != 0))||year % 400 == 0) return true;
	        else return false;
	}
	
	//to check prime
	public static List<Integer> findPrime(int low,int high) {
		int flag = 1;
		int i;
		List<Integer> arr = new ArrayList<>();
		for (i = low; i < high; i++) {
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
		return arr;
	}
	public static Set<Integer> primeAnagram(List<Integer> primeList) {
		Set<Integer> primeAnagram = new HashSet<>();
		for (int i = 0; i < primeList.size(); i++) {
			for (int j = i+1; j < primeList.size(); j++) {
				if (AlgorithmUtility.anagramDetection(String.valueOf(primeList.get(i)), String.valueOf(primeList.get(j)))) {
					primeAnagram.add(primeList.get(i));
					primeAnagram.add(primeList.get(j));
				}
			}
		}
		return primeAnagram;
	}
	public static Stack primeAnagram2(List<Integer> primeList) {
//		Set<Integer> primeAnagram = new HashSet<>();
		Stack stack=new Stack();
		for (int i = 0; i < primeList.size(); i++) {
			for (int j = i+1; j < primeList.size(); j++) {
				if (AlgorithmUtility.anagramDetection(String.valueOf(primeList.get(i)), String.valueOf(primeList.get(j)))) {
					stack.push(primeList.get(i));
					stack.push(primeList.get(j));
				}
			}
		}
		return stack;
	}
	public static Queue primeAnagram3(List<Integer> primeList) {
		Queue queue=new Queue(1000);
		for (int i = 0; i < primeList.size(); i++) {
			for (int j = i+1; j < primeList.size(); j++) {
				if (AlgorithmUtility.anagramDetection(String.valueOf(primeList.get(i)), String.valueOf(primeList.get(j)))) {
					queue.enqueue(primeList.get(i));
					queue.enqueue(primeList.get(j));
				}
			}
		}
		return queue;
	}
	public static void printPrimeAndAnagram(List<List<Integer>> list1)
	{
		List<Integer> demo = new ArrayList<Integer>();
		for (int i = 0; i < list1.size(); i++) {
			demo = list1.get(i);
			if (i == 0) {
				System.out.println("Numbers which are prime and anagram are:"+demo.size());
				System.out.println();
				for (int j = 0; j < demo.size(); j++) {
					System.out.print(demo.get(j) + " ");
				}
			} else {
				System.out.println("Numbers which are prime but not anagram are:"+demo.size());
				System.out.println();
				for (int j = 0; j < demo.size(); j++) {
					System.out.print(demo.get(j) + " ");
				}
			}
			System.out.println();
		}
	}
	//Anagram Stack
	public static int[] sortArray(int [] arr) {
		int length = arr.length;
		for (int i = 1; i < length; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j]>key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
		return arr;
	}
	
	public boolean isBalanced(char exp[]) {

		Stack st = new Stack();
		for (int i = 0; i < exp.length; i++) {
			if (exp[i] == '(')
				st.push(exp[i]);

			if (exp[i] == ')') {
				if (st.isEmpty()) {
					return false;
				}

				else if (!Pair((char) st.pop(), exp[i])) {
					return false;
				}
			}

		}

		if (st.isEmpty())
			return true;
		else
			return false;
	}

	public static boolean Pair(char character1, char character2) {
		if (character1 == '(' && character2 == ')')
			return true;
		else
			return false;
	}	
	
	public static void OrderedSearch(LinkedList<Integer> li2,int key)
	{
		int len=li2.size();
		  System.out.println(len);
		  boolean b=li2.findIntegerValue(len,key,li2);
		  if(b)
		  {
			  System.out.println("name found");
			  System.out.println("number is removed from the file ");
			  System.out.println("new file list is :");
			  li2.printNew();
		  }
		  else
		  {
			  System.out.println("name not found");
			  System.out.println("seached word added to file ");
			  li2.printNew();
		  }
	}
	public static void orderedWrite(LinkedList<Integer> li2,LinkedList<Integer> li) throws IOException
	{
		FileWriter w=new FileWriter("/home/admin1/Desktop/file4.txt",true);
		BufferedWriter writer = new BufferedWriter(w);
		FileOutputStream writer2 = new FileOutputStream("/home/admin1/Desktop/file4.txt");
        writer2.write(("").getBytes());
        writer2.close();
  		int len2=li2.size();
  		li2.printNew();
  		int [] newStr=li.convertInt(li2, len2);
  		String[] newStringArray = new String[newStr.length];
  		for(int i=0; i<newStr.length; i++) {
  			newStringArray[i] = String.valueOf(newStr[i]);
  		}
  		for(int i=0;i<newStringArray.length;i++)
  		{
  			writer.write(newStringArray[i]);
  			writer.write(" ");
  		}
  		writer.flush();
  		writer.close();
	}
}

package com.bridgelabz.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OopsUtility {
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
	public static float userFloat() {

		return scanner.nextFloat();

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

	public static String replaceString(String first,String fullName,String phoneNum,String date,String line) {
		final  String REGEX_NAME1 = "<<name>>";
		final  String REGEX_NAME2 = "<<full name>>";
		final  String REGEX_NAME3 = "xxxxxxxxxx";
		final  String REGEX_NAME4 = "<<XX/XX/XXXX>>";
		Pattern p1 = Pattern.compile(REGEX_NAME1);
		Matcher m1 = p1.matcher(line);
		line = m1.replaceAll(first);
		
		Pattern p2 = Pattern.compile(REGEX_NAME2);
		Matcher m2 = p2.matcher(line);
		line = m2.replaceAll(fullName);
	
		Pattern p3 = Pattern.compile(REGEX_NAME3);
		Matcher m3 = p3.matcher(line);
		line = m3.replaceAll(phoneNum);

		Pattern p4 = Pattern.compile(REGEX_NAME4);
		Matcher m4 = p4.matcher(line);
		line = m4.replaceAll(date);
		return line;
	}
	
	public static String readFile(String str) throws FileNotFoundException {
		FileReader f = new FileReader(str);
		@SuppressWarnings("resource")
		BufferedReader read = new BufferedReader(f);
		String line = "";
		try {
			String word="";
			while ((word = read.readLine()) != null) {
				line = word;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return line;
	}
	public static void write(String json) throws IOException
	{
		FileWriter fw = new FileWriter("/home/admin1/Documents/adiga_docs/Programs/Files/json1.json");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(json);
		bw.flush();
	}
	public static InventoryList insertInventoryList(String inventoryName,List<Inventory> listOfInventories)
	{
		InventoryList inventoryList = new InventoryList();
		inventoryList.setInventoryName(inventoryName);
		inventoryList.setListOfInventories(liInventories);
		return inventoryList;
	}
	static List<Inventory> liInventories = new ArrayList<Inventory>();
	public static List<Inventory> insertInventory(String name,float weight,double price)
	{
		Inventory inventory = new Inventory();
		inventory.setName(name);
		inventory.setWeight(weight);
		inventory.setPrice(price);
		liInventories.add(inventory);
		return liInventories;
	}
}

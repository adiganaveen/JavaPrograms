package com.bridgelabz.oopsprograms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import com.bridgelabz.util.OopsUtility;

public class Regex {

	public static void main(String[] args) throws FileNotFoundException {
		String str = "/home/admin1/Documents/adiga_docs/Programs/Files/Regex.txt";
		FileReader f = new FileReader(str);
		@SuppressWarnings("resource")
		BufferedReader read = new BufferedReader(f);
		String line = "";
		String word="";
		try {
			while ((word = read.readLine()) != null) {
				line = word;
			}
			System.out.println(line);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Please enter the first name");
		String firstName = OopsUtility.userString();
		System.out.println("Please enter the last name");
		String lastName = OopsUtility.userString();
		String fullName = firstName + " " + lastName;
		System.out.println("Please enter your 10 digit phone number");
		String phoneNum = OopsUtility.userString();
		System.out.println("Please enter date in the format DD/MM/YYYY");
		String date = OopsUtility.userString();
		String message = OopsUtility.replaceString(firstName, fullName, phoneNum, date, line);
		System.out.println(message);
	}
}

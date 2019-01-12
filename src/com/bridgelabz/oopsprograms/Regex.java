package com.bridgelabz.oopsprograms;

import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.bridgelabz.util.OopsUtility;

public class Regex {

	public static void main(String[] args) throws FileNotFoundException {
		String str = "/home/admin1/Documents/adiga_docs/New_Programs/Files/Regex.txt";
		String line=OopsUtility.readFile(str);
		System.out.println("Please enter the first name");
		String firstName = OopsUtility.userString();
		System.out.println("Please enter the last name");
		String lastName = OopsUtility.userString();
		String fullName = firstName + " " + lastName;
		System.out.println("Please enter your 10 digit phone number");
		String phoneNum = OopsUtility.userString();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");  
		LocalDateTime now = LocalDateTime.now();  
		String date=dtf.format(now);
		String message = OopsUtility.replaceString(firstName, fullName, phoneNum, date, line);
		System.out.println(message);
		
	}
}

/******************************************************************************
 *  Compilation:  javac -d bin BinarySearsch.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprogram.BinarySearsch n
 *  
 *  Purpose: To find whether the give key present in a csv file or not
 *
 *  @author  Naveen Adiga
 *  @version 1.0
 *  @since   24-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.algorithmprograms;

import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;


import com.bridgelabz.util.AlgorithmUtility;

public class BinarySearsch {
	/*
	* The main function is written to take input from the user and
	* calls binarySeacrhFile function to search word from list
	*/
	public static void main(String[] args) throws FileNotFoundException {
		String csvFile = "/home/admin1/Desktop/file.csv";
		BufferedReader fileReader = new BufferedReader(new FileReader(csvFile));
		final String DELIMITER = ",";
		try {
			String line = "";
			while ((line = fileReader.readLine()) != null) {
				String[] tokens = line.split(DELIMITER);
				AlgorithmUtility.sort(tokens);
				for (String token : tokens) {
					// Print all tokens
					System.out.println(token);
				}
				System.out.println("enter the key word which has to be searched ");
				String key = AlgorithmUtility.userString();
				int i = AlgorithmUtility.binarySearch(tokens, key);
				if (i >= 0) {
					System.out.println(tokens[i] + " is present in " + (i + 1) + " position in the array");
				} else
					System.out.println(key + " doesnot exists in the given csv file");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fileReader.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}

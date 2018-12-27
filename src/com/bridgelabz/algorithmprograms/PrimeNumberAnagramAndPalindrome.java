/******************************************************************************
 *  Compilation:  javac -d bin PrimeNumberAnagramAndPalindrome.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprogram.PrimeNumberAnagramAndPalindrome n
 *  
 *  Purpose: To find prime number is both anagram and palindrome
 *
 *  @author  Naveen Adiga
 *  @version 1.0
 *  @since   24-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.algorithmprograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.bridgelabz.util.AlgorithmUtility;

public class PrimeNumberAnagramAndPalindrome {

	public static void main(String[] args) {
		System.out.println("enter the range it where prime numbers has to be found");
		int num=AlgorithmUtility.userInteger(); //user input
		List<Integer> arr=new ArrayList<>(); //creating list
		//Method 1- using non-static function of AlgorithmUtility class of com.bridgelabz.util package
		arr=AlgorithmUtility.findPrime(num);
		
		Set<Integer> primeAnagramSet=new HashSet<>();//creating set
	    System.out.println("The prime numbers which are anagrams are");
	    //Method 2- using non-static function of AlgorithmUtility class of com.bridgelabz.util package
	    primeAnagramSet=AlgorithmUtility.primeAnagram(arr);

	    Set<Integer> primePalindromeSet=new HashSet<>();//creating set
        System.out.println("The prime numbers which are anagram and palindrome are");
        //Method 3- using non-static function of AlgorithmUtility class of com.bridgelabz.util package
        primePalindromeSet=AlgorithmUtility.primePalindrome(primeAnagramSet);
        System.out.println(primePalindromeSet); //displaying output

	}

}

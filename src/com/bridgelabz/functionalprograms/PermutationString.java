package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class PermutationString {
	public static void main(String[] args) {
		FunctionalUtility func = new FunctionalUtility();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String str = sc.next();
		int len = str.length();
		System.out.println("recursion of a string is ");
		func.recursion(str, 0, len);
		System.out.println("iteration of a string is ");
		func.iteration(str);
	}
}

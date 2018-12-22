//Monthly Payment
/*Naveen Adiga
  21/12/2018
 */

package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtility;

public class MonthlyPayment {
	public static void main(String[] args) {
		AlgorithmUtility algo = new AlgorithmUtility();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter PRINCIPAL loan amount");
        double p=sc.nextDouble();
        System.out.println("enter per cent of interest");
        double r=sc.nextDouble();
        System.out.println("enter number of years");
        double y=sc.nextDouble();
//		String i = args[0];
//		String j = args[1];
//		String k = args[2];
//		double p = Double.parseDouble(i);
//		double r = Double.parseDouble(j);
//		double y = Double.parseDouble(k);
		algo.payment(p, r, y);
	}
}

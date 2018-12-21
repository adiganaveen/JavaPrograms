//Vending Machine
/*Naveen Adiga
  21/12/2018
 */



package com.bridgelabz.algorithmprograms;

import java.util.Scanner;

import com.bridgelabz.util.AlgorithmUtility;

public class VendingMachine 
{
	public static void main(String[] args) {
		AlgorithmUtility algo=new AlgorithmUtility();
        Scanner sc=new Scanner(System.in);
        System.out.println("Bill is ");
        int money=sc.nextInt();
        System.out.println("Money given by the customer is ");
        int money2=sc.nextInt();
        int money3=money2-money;
        int [] curr= {1,2,5,50,10,500,100,1000};
        System.out.println("Change given to the customer is ");
        algo.minChange(curr,money3);
        System.out.println("total money given is "+money3);
	}

}

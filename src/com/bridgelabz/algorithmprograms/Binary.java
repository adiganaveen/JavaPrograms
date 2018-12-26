package com.bridgelabz.algorithmprograms;

import com.bridgelabz.util.AlgorithmUtility;

public class Binary {
	public static void main(String[] args) {
		System.out.println("Enter the decimal number");
		int num=AlgorithmUtility.userInteger();
		int[] binary=AlgorithmUtility.decimalToBinary(num);
		int [] binary2=new int[binary.length];
		int k=0;
		for(int i=binary.length-1;i>=0;i--)
		{
			binary2[k]=binary[i];
			k++;
			
		}
		System.out.println();
		for(int i=0;i<binary2.length;i++)
		{
			System.out.print(binary2[i]);
		}
		System.out.println();
		System.out.println("swaping nibbles");
		System.out.println();
		int first=0,last=binary.length-1;
		int middle=(first+last)/2;
		int [] binary3=AlgorithmUtility.swapNibble(first,middle,last,binary2);
		for(int i=0;i<binary3.length;i++)
		{
			System.out.print(binary3[i]);
		}
	
		int sum=AlgorithmUtility.decimal(binary3);
		System.out.println();
		System.out.println("decimal number : "+sum);
		System.out.println();
		boolean b=AlgorithmUtility.powerOf2(sum);
		if(b==true)
		System.out.println("the resultant number "+sum+" is the number is a power of 2");
		else
			System.out.println("the resultant number "+sum+" is not the number is a power of 2");
			
		
	}

}

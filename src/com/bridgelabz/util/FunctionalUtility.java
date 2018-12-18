//It is functional utility class
/*Naveen Adiga
  18/12/2018
 */



package com.bridgelabz.util;

import java.util.Random;

public class FunctionalUtility 
{
	public void replaceString(String uname)
	{
		if (uname.length()<3)
		{
			System.out.println("enter a name greater than 3 alphabets");
		}
		else
		System.out.println("Hai "+uname+" ,How are you?");
	}

	public void leapYear(int year)
	{
		int b=Integer.toString(year).length();
		if(b!=4)
		{
			System.out.println("enter the valid 4 digit year");
		}
		else
		{
		if(year%400==0 || year%4==0 && year%100!=0)
		{
			System.out.println(year+"is a leap year");
		}
		else 
			System.out.println(year+"not a leap year");
		}
	}
	
	public void flipCoin(int num)
	{
		int head=0,tail=0;
		int n=num;
		Random r=new Random();
		while(num>0)
		{
			int rn=r.nextInt(2);
			if(rn==0)
				head++;
			else
				tail++;
			num--;
		}
		System.out.println("percentage of head is "+head*100/n);
		System.out.println("percentage of tail is "+tail*100/n);
	}


	public void pow(double a,double b)
	{
		double c=Math.pow(a,b);
		System.out.println("value of 2 power "+b+" is "+c);
	}
	
	
	public double harmonicValue(int n)
	{
		double sum=0.0;
		if(n<1)
			return 2;
		else
			for(double i=1;i<=n;i++)
			{
				sum=sum+(1/i);
			}
			return sum;
	}
	
	
	public void factorial(int n)
	{
		int[] a=new int[n/2];
		int[] b=null;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
			}
		}
	}
	
	public static void primeFactors(int n) 
    { 
        while (n%2==0) 
        { 
            System.out.print(2 + " "); 
            n = n/2; 
        } 
        for (int i = 3; i <= n; i+= 2) 
        { 
            while (n%i == 0) 
            { 
                System.out.print(i + " "); 
                n = n/i; 
            } 
        } 
        //if (n > 2) 
        //    System.out.print(n); 
    } 
	
	
}

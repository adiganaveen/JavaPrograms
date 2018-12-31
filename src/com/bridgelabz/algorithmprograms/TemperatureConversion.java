/******************************************************************************
 *  Compilation:  javac -d bin TemperatureConversion.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprogram.TemperatureConversion n
 *  
 *  Purpose: Converts the temperture given to Fahrenheit or Celcius temperature
 *
 *  @author  Naveen Adiga
 *  @version 1.0
 *  @since   21-12-2018
 *
 ******************************************************************************/




package com.bridgelabz.algorithmprograms;



import com.bridgelabz.util.AlgorithmUtility;

public class TemperatureConversion 
{
	/*
	* The main function is written to take input from the user and
	* call the tempConversion function that converts temperature
	*/
	public static void main(String[] args) {
      //Reading the input from the user
       int n=0;
        do {
        	System.out.println("1.to convert celcius to fahrenheit\n2.to convert fahrenheit to celcius\n3.exit");
        	int choice=AlgorithmUtility.userInteger();
        	switch(choice)
        	{
        	case 1: System.out.println("enter the celsius to be converted to fahrenheit");
            		double celsius=AlgorithmUtility.userDouble();
            		double temp=AlgorithmUtility.tempCToF(celsius);
            		System.out.println("fahrenheit =" + temp);
            		break;
        	case 2: System.out.println("enter the fahrenheit to be converted to celsius");
            		double fahrenheit=AlgorithmUtility.userDouble();
            		double temp2=AlgorithmUtility.tempFToC(fahrenheit);
            		System.out.println("celsius =" + temp2);
            		break;
        	case 3:System.exit(0);
        			break;
        	default:System.out.println("select from choice");
        			break;
        	}
        	n++;
        }while(n<=30);
       
       
	}

}

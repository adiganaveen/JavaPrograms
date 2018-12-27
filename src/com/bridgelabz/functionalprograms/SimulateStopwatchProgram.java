/******************************************************************************
 *  Compilation:  javac -d bin SimulateStopwatchProgram.java
 *  Execution:    java -cp bin package com.bridgelabz.functionalprograms.SimulateStopwatchProgram
 *  
 *  Purpose:  Write a Stopwatch Program for measuring the time that elapses between
 *  		 the start and end clicks
 *
 *  @author  Naveen Adiga
 *  @version 1.0
 *  @since   19-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.functionalprograms;

import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class SimulateStopwatchProgram {
	/*
	* The main function is written to take input from the user and
	* call stopWatch function that measures elapsed time
	*/
	public static void main(String[] args) {
//		FunctionalUtility func = new FunctionalUtility();
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 to start\n");
		//Method 1- using static function of FunctionalUtilty class of com.bridgelabz.util package
		int start = sc.nextInt();
		FunctionalUtility.start(start);
		System.out.println("Press 2 to stop\n");
		//Method 2- using static function of FunctionalUtilty class of com.bridgelabz.util package
		int stop = sc.nextInt();
		FunctionalUtility.stop(stop);
		System.out.println("Press 3 to display the differntial time\n");
		int diffTime = sc.nextInt();
		//Method 3- using static function of FunctionalUtilty class of com.bridgelabz.util package
		long time=FunctionalUtility.differentialTime(diffTime);
		System.out.println("Time of stopwatch is : " + time + "millisec");
		System.out.println("Time of stopwatch is : " + (time / 1000) + "sec");
		System.out.println("Time in minutes is : " + (time / 60000) + "mins");
		sc.close();
	}
}

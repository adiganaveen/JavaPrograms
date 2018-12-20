//Simulate Stopwatch Program
/*Naveen Adiga
  20/12/2018
 */

package com.bridgelabz.functionalprograms;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

import com.bridgelabz.util.FunctionalUtility;

public class SimulateStopwatchProgram {
	public static void main(String[] args) {
		FunctionalUtility func = new FunctionalUtility();
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 to start\n");
		int start = sc.nextInt();
		func.start();
		System.out.println("Press 2 to stop\n");
		int stop = sc.nextInt();
		func.stop();
		System.out.println("Press 3 to display the differntial time\n");
		int diffTime = sc.nextInt();
		func.differentialTime();
		sc.close();
	}

}

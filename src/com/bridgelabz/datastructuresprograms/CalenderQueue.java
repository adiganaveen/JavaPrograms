package com.bridgelabz.datastructuresprograms;

import java.util.LinkedList;

import com.bridgelabz.util.DataStructureUtility;
import com.bridgelabz.util.Queue;

public class CalenderQueue {
	public static void main(String[] args) {
		int month = Integer.parseInt(args[0]);
		int year = Integer.parseInt(args[1]);
		String[] months = { "", "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		if (month == 2 && DataStructureUtility.isLeapYear(year)) {
			days[month] = 29;
		}
		System.out.println("\t\t " + months[month] + " " + year);
		System.out.println("Sun\tMon\tTue\tWed\tThu\tFri\tSat");
		int d = DataStructureUtility.day(month, 1, year);
		Queue queue1=new Queue(1000);
		
		for (int i = 1; i <= days[month]; i++) {
			Queue queue2=new Queue(1000);
			queue2.enqueue(i);
			if (((i + d) % 7 == 0) ) {
				queue1.enqueue(queue2);
				continue;
			}
		}
		for (int i = 0; i < d; i++)
			System.out.print("\t");
		for (int i = 1; i <= days[month]; i++) {
			while(!queue1.isEmpty())
			{
				queue1.remove();
			}
		if (((i + d) % 7 == 0) ) {
			System.out.println();
		}
		}
	}
}

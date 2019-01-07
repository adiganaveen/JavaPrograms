/******************************************************************************
 *  Compilation:  javac -d bin UnOrderedList.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprogram.UnOrderedList n
 *  
 *  Purpose: Create the Week Object having a list of WeekDay objects each 
 *  			storing the day (i.e S,M,T,W,Th,..) and the Date (1,2,3..) . 
 *  			The WeekDay objects are stored in a Queue implemented using 
 *  			Linked List. Further maintain also a Week Object in two stacks to
 *  			finally display the Calendar
 *
 *  @author  Naveen Adiga
 *  @version 1.0
 *  @since   4-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.datastructuresprograms;

import com.bridgelabz.util.DataStructureUtility;
import com.bridgelabz.util.QueueLinkedList;
import com.bridgelabz.util.StackLinkedList;

public class CalenderStack {
	/*
	* The main function is to take the input from the user 
	* and printing the calendar by using queue and stacks 
	*/
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
		StackLinkedList<QueueLinkedList<Integer>> mainStack=new StackLinkedList<>();
		QueueLinkedList<Integer> queue=new QueueLinkedList<>();
		for (int i = 1; i <= days[month]; i++) {
			queue.enqueue(i);
			if (((i + d) % 7 == 0 || i==days[month]) ) {
				mainStack.push(queue);
				queue=new QueueLinkedList<Integer>();
				continue;
			}
		}	
		for (int i = 0; i < d; i++)
		System.out.print("\t");
		int size = mainStack.getSize();
		StackLinkedList<QueueLinkedList<Integer>> stackNew = new StackLinkedList<>();
		
		for(int i=0; i < size; i++){
			stackNew.push(mainStack.pop());
		}

		for (int i = 0; i < size; i++) {
			QueueLinkedList<Integer> week = stackNew.pop();
			for (int j = 0; j < week.getSize(); j++) {
				System.out.print(week.dequeue() + "\t");
			}
			System.out.println();
		}

	}

}

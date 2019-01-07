/******************************************************************************
 *  Compilation:  javac -d bin SimulateBankingCashCounter.java
 *  Execution:    java -cp bin com.bridgelabz.algorithmprogram.SimulateBankingCashCounter n
 *  
 *  Purpose: reate a Program which creates Banking Cash Counter where people
 *  come in to deposit Cash and withdraw Cash. Have an input panel to add people
 *  to Queue to either deposit or withdraw money and dequeue the people. Maintain
 *  the Cash Balance.
 *
 *  @author  Naveen Adiga
 *  @version 1.0
 *  @since   3-12-2018
 *
 ******************************************************************************/

package com.bridgelabz.datastructuresprograms;

import com.bridgelabz.util.DataStructureUtility;
import com.bridgelabz.util.Queue;

public class SimulateBankingCashCounter {
	/*
	* The main function is written to take input from the user
	* to perform transactions by using customized queue
	*/
	public static void main(String[] args) {
		/*
		 * Customized queue in com.bridgelabz.util package
		 */
		Queue<Integer> queue=new Queue<Integer>(100);
		int n=0,i=0;
		double cashCount=10000;
		do {
			System.out.println("1.Enter to add people on to queue\n2.Check cashier balance\n3.exit");
			int choice=DataStructureUtility.userInteger();
			switch(choice)
			{
			case 1:
				//Method 1- using function of Queue class of com.bridgelabz.util package
					queue.enqueue(i++);
					System.out.println(i+" Person added to queue\n");
					System.out.println("Select your choice\n1.do you want to Deposit\n2.Do you want to Withdraw");
					int value=DataStructureUtility.userInteger();
					switch(value)
					{
					case 1: System.out.println("Enter the amount to be added");
							double cashDeposit=DataStructureUtility.userDouble();
							cashCount+=cashDeposit;
							System.out.println();
							System.out.println("cash deposited and updated on to your account");
							break;
					case 2:System.out.println("Enter the amount to be withdraw");
							double cashWithdraw=DataStructureUtility.userDouble();
							if(cashCount<cashWithdraw)
							{
								System.out.println("amount cannot be withdrawn or no cash with cashier due to technical problem in bank\n"); 
							}
							else
							{
							cashCount-=cashWithdraw;
							System.out.println("\ncash debited and updated your account balance\n");
							}
							break;
					default:System.out.println("choose correct choice");
					}
					//Method 1- using function of Queue class of com.bridgelabz.util package
					queue.dequeue();
					System.out.println("removed him from the queue");
					break;
			case 2:System.out.println("Cash count is :"+cashCount);
					break;
			case 3:System.exit(0);
					break;
			default:System.out.println("choose correct choice");
			}
			n++;
		}while(n<30);
		
	}

}

package com.bridgelabz.datastructuresprograms;

import com.bridgelabz.util.DataStructureUtility;
import com.bridgelabz.util.Queue;

public class SimulateBankingCashCounter {
	public static void main(String[] args) {
		Queue queue=new Queue(100);
		int n=0,i=0;
		double cashCount=10000;
		do {
			System.out.println("1.Enter to add people on to queue\n2.Check cashier balance\n3.exit");
			int choice=DataStructureUtility.userInteger();
			switch(choice)
			{
			case 1:
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

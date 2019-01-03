package com.bridgelabz.datastructuresprograms;

import com.bridgelabz.util.DataStructureUtility;
import com.bridgelabz.util.Deque;

public class Palindrome­Checker
{
	public static void main(String[] args) {
		Deque deque=new Deque(100);
		int n=0;
		do {
			System.out.println("1.To check palindrome\n2.Exit");
			int choice=DataStructureUtility.userInteger();
			switch(choice)
			{
			case 1:System.out.println("Enthe string to check to check it is palindrome or not");
					String str=DataStructureUtility.userString();
					char[] ch=str.toCharArray();
					int flag=0;
					for(int i=0;i<ch.length;i++)
					{
						deque.addFront(ch[i]);
					}
					System.out.println(deque.size());
					while(deque.size()>1)
					{
						if(deque.removeFront()!=deque.removeRear())
						{
							flag=1;
						}
					}
					if(flag==0)
					{
						System.out.println("it is a palindrome");
					}
					else
					{
						System.out.println("it is not a palindrome");
					}
					break;
			case 2:System.exit(0); break;
			default:System.out.println("please select correct choice");break;
		}
		n++;
		}while(n<30);
	}

}

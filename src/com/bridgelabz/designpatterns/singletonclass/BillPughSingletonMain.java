package com.bridgelabz.designpatterns.singletonclass;

public class BillPughSingletonMain {
public static void main(String[] args) {
	BillPughSingleton billPughSingleton=BillPughSingleton.getInstance();
	System.out.println(billPughSingleton);
	System.out.println();
	BillPughSingleton billPughSingleton2=BillPughSingleton.getInstance();
	System.out.println(billPughSingleton2);
}
}

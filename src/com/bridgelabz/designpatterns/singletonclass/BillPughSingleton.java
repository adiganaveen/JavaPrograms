package com.bridgelabz.designpatterns.singletonclass;

public class BillPughSingleton {
	private BillPughSingleton() {
	}

	private static class SingletonHelper {
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}

	public static BillPughSingleton getInstance() {
		System.out.println("Testing....");
		return SingletonHelper.INSTANCE;
	}
}

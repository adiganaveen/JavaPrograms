package com.bridgelabz.designpatterns.singletonclass;

public class ThreadSafeSingletonMain {
	public static void main(String[] args) {
		ThreadSafeSingleton threadSafeSingleton=ThreadSafeSingleton.getInstance();
		System.out.println(threadSafeSingleton);
		ThreadSafeSingleton threadSafeSingleton2=ThreadSafeSingleton.getInstanceUsingDoubleLocking();
		System.out.println(threadSafeSingleton2);
	}
}

package com.bridgelabz.designpatterns.singletonclass;

public class EagerInitializedSingleton {

	private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

	private EagerInitializedSingleton() {
	}

	public static EagerInitializedSingleton getInstance() {
		System.out.println("Testing Eager Initialized Singleton Class");
		return instance;
	}
}

package com.bridgelabz.designpatterns.singletonclass;

public class EagerInitializedSingletonMain {
	
	/**
	 * In eager initialization, the instance of Singleton Class is created at the time of class loading,
	 * this is the easiest method to create a singleton class but it has a drawback that instance is 
	 * created even though client application might not be using it.
	 */
	public static void main(String[] args) {
		EagerInitializedSingleton earEagerInitializedSingleton=EagerInitializedSingleton.getInstance();
		System.out.println(earEagerInitializedSingleton);
		System.out.println();
		EagerInitializedSingleton earEagerInitializedSingleton2=EagerInitializedSingleton.getInstance();
		System.out.println(earEagerInitializedSingleton2);
	}
}

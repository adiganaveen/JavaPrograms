package com.bridgelabz.designpatterns.singletonclass;

public class StaticBlockInitializationMain {
	
	/**
	 * Static block initialization implementation is similar to eager initialization, except that 
	 * instance of class is created in the static block that provides option for exception handling.
	 */
	public static void main(String[] args) {
		StaticBlockInitialization staticBlockInitialization=StaticBlockInitialization.getInstance();
		System.out.println(staticBlockInitialization);
		System.out.println();
		StaticBlockInitialization staticBlockInitialization2=StaticBlockInitialization.getInstance();
		System.out.println(staticBlockInitialization2);
	}
}

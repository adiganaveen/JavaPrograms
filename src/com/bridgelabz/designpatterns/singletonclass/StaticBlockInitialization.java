package com.bridgelabz.designpatterns.singletonclass;

public class StaticBlockInitialization {

	private static StaticBlockInitialization instance;

	private StaticBlockInitialization() {
	}

	static {
		try {
			instance = new StaticBlockInitialization();
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}

	public static StaticBlockInitialization getInstance() {
		System.out.println("Testing static block initialization");
		return instance;
	}
}

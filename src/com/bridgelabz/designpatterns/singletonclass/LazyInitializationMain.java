package com.bridgelabz.designpatterns.singletonclass;

public class LazyInitializationMain {
	public static void main(String[] args) {
		LazyInitialization lazyInitialization=LazyInitialization.getInstance();
		System.out.println(lazyInitialization);
		LazyInitialization lazyInitialization2=LazyInitialization.getInstance2();
		System.out.println(lazyInitialization2);
	}
}

package com.bridgelabz.designpatterns.singletonclass;

public class LazyInitialization {
	   private static LazyInitialization instance;
	   private static LazyInitialization instance2;
	    private LazyInitialization(){}
	    
	    public static LazyInitialization getInstance(){
	        if(instance == null){
	        	 System.out.println("Testing lazy initialization");
	            instance = new LazyInitialization();
	        }
	        return instance;
	    }
	    public static LazyInitialization getInstance2(){
	        if(instance == null){
	        	 System.out.println("Testing lazy initialization");
	            instance = new LazyInitialization();
	        }
	        return instance2;
	    }
}

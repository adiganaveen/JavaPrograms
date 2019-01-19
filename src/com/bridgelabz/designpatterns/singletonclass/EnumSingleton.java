package com.bridgelabz.designpatterns.singletonclass;

public enum EnumSingleton {
  INSTANCE;
    
    public static void doSomething(EnumSingleton e){
    	System.out.println("Testing enum");
       if(e==EnumSingleton.INSTANCE)
       {
    	   System.out.println(INSTANCE.hashCode());
       }
    }
}

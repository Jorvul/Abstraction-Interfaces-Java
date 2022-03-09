package com.revature.emp;

public interface Tax {
	//if method in interface is not abstract then they should have keyword default
	public default void someMethod() {
		System.out.println("Some method");
	}
	//interfaces can also have static methods
	public static void someMethod2() {
		System.out.println("abc");
	}
	//considered abstract
	public void calculateTax();
}


//interface without methods is known as marker interface
//marker interfaces
//Clonable, Serialzable, Remote

//interface having default and static method but only one abstract method is known as single abstract method interfaces
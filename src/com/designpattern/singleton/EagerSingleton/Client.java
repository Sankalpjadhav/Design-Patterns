package com.designpattern.singleton.EagerSingleton;

public class Client {

	public static void main(String[] args) {
		/*
		we cannot create instance using new operator since constructor is defined it private
		EagerRegistry singleton = new EagerRegistry();
		*/
		EagerRegistry singleton = EagerRegistry.getInstance(); // We have defined getInstance() method static so we can need to access using Classname.methodName()
		EagerRegistry singleton2 = EagerRegistry.getInstance();
		System.out.println(singleton == singleton2);
		// Output : True, that means both objects are same
	}
}

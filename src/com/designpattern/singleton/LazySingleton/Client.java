package com.designpattern.singleton.LazySingleton;

public class Client {

	public static void main(String[] args) {
		LazyRegistry singleton = LazyRegistry.getInstance();
		LazyRegistry singleton2 = LazyRegistry.getInstance();
		System.out.println(singleton == singleton2);
	}

}

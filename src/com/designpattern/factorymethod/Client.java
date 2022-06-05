package com.designpattern.factorymethod;

import com.designpattern.factorymethod.message.Message;

public class Client {

	public static void main(String[] args) {
		printMessage(new com.designpattern.factorymethod.JSONMessageCreator());
		
		printMessage(new com.designpattern.factorymethod.TextMessageCreator());
	}
	
	public static void printMessage(com.designpattern.factorymethod.MessageCreator creator) {
		Message msg = creator.getMessage();
		System.out.println(msg);
	}
}

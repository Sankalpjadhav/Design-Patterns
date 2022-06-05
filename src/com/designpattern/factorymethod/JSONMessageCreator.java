package com.designpattern.factorymethod;

import com.designpattern.factorymethod.message.JSONMessage;
import com.designpattern.factorymethod.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new JSONMessage();
	}
	
}

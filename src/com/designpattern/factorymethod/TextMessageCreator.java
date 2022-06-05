package com.designpattern.factorymethod;

import com.designpattern.factorymethod.message.Message;
import com.designpattern.factorymethod.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new TextMessage();
	}



}

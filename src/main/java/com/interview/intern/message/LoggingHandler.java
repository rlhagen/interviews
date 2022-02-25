package com.interview.intern.message;

public class LoggingHandler implements MessageHandler {

	@Override
	public void onMessage(Message<?> message) {
		System.out.println(message);
	}

}

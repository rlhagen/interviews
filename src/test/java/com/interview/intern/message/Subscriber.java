package com.interview.intern.message;

import java.util.function.Predicate;

public class Subscriber {
	private final Predicate<Message> predicate;
	private final MessageHandler handler;

	public Subscriber(String subscription, MessageHandler handler) {
		this.predicate = PredicateParser.parse(subscription);
		this.handler = handler;
	}

	public boolean isSubscribed(Message<?> message){
		return predicate.test(message);
	}

	public void onMessage(Message<?> message){
		handler.onMessage(message);
	}

}

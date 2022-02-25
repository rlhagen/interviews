package com.interview.intern.message;

import java.util.Map;

public class Message<T> {
	private final T payload;

	public Message(T payload) {
		this.payload = payload;
	}

	public T getPayload(){
		return this.payload;
	}

	@Override
	public String toString() {
		return "Message{" +
				"payload=" + payload +
				'}';
	}
}

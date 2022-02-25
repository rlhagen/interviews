package com.interview.intern.message;

import java.util.function.Predicate;

public class PredicateParser {

	public static Predicate<Message> parse(String subscription) {
		String[] parts = subscription.split("=");
		if (parts.length > 1 && parts[0].equals("contains")) {
			return (message -> ((String) message.getPayload()).contains(parts[1]));
		}

		return message -> false;
	}

}

package com.interview.intern.message;

import java.util.ArrayList;
import java.util.List;

public class MessageRouter {
	private final Configuration configuration;

	public MessageRouter(Configuration configuration) {
		this.configuration = configuration;
	}

	public void route(Message<?> message) {
		for (Subscriber subscriber : configuration.getSubscribers()) {
			if (subscriber.isSubscribed(message)) {
				subscriber.onMessage(message);
			}
		}
	}

	public static class Configuration {
		private final List<Subscriber> subscribers;

		private Configuration(List<Subscriber> subscribers) {
			this.subscribers = subscribers;
		}

		public List<Subscriber> getSubscribers() {
			return subscribers;
		}

		public static Configuration.Builder builder() {
			return new Configuration.Builder();
		}

		public static class Builder {
			private List<Subscriber> subscribers = new ArrayList<>();

			public Configuration.Builder subscribe(Subscriber handler) {
				this.subscribers.add(handler);
				return this;
			}

			public Configuration build() {
				return new Configuration(subscribers);
			}
		}

	}
}

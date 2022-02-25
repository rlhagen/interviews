package com.interview.intern.message;


public class Application {

	public static void main(String[] args) {
		MessageHandler handler = new LoggingHandler();
		MessageRouter.Configuration configuration = MessageRouter.Configuration.builder()
				.subscribe(new Subscriber("contains=Putin", handler))
				.subscribe(new Subscriber("contains=Trump", handler))
				.subscribe(new Subscriber("contains=Biden", handler))
				.subscribe(new Subscriber("contains=Ryan", new HttpMessageHandler()))
				.build();

		MessageRouter router = new MessageRouter(configuration);
		router.route(new Message("hello there Putin from Ryan!"));
	}

}

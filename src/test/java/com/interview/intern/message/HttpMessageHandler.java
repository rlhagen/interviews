package com.interview.intern.message;

import java.io.IOException;

import org.apache.http.HttpRequest;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

public class HttpMessageHandler implements MessageHandler {

	@Override
	public void onMessage(Message<?> message) {
		DefaultHttpClient httpClient = new DefaultHttpClient();
		HttpGet request = new HttpGet("https://google.com");
		try {
			CloseableHttpResponse response = httpClient.execute(request);
			System.out.println(response);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}

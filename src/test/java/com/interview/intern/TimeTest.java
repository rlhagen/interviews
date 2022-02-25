package com.interview.intern;

import static org.junit.Assert.*;

import org.junit.Test;

public class TimeTest {

	@Test
	public void test() {
		String time = new Time().format("12:01:00PM");
		System.out.println(time);
	}

}
package com.interview.intern;

import static org.junit.Assert.*;

public class YahtzeeTest {
	private static final int[] SAMPLE_1 = {1,2,3,4,5};
	private static final int[] SAMPLE_2 = {5,5,5,5,5};
	private static final int[] SAMPLE_3 = {2,2,5,2,5};
	private static final int[] SAMPLE_4 = {2,2,2,5,5};

	public void isThreeOfKind() {
		Yahtzee yahtzee =  new Yahtzee();
		assertFalse(yahtzee.isThreeOfKind(SAMPLE_1));
		assertFalse(yahtzee.isThreeOfKind(SAMPLE_2));
		assertTrue(yahtzee.isThreeOfKind(SAMPLE_3));
		assertTrue(yahtzee.isThreeOfKind(SAMPLE_4));
	}

}
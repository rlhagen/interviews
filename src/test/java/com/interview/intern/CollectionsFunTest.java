package com.interview.intern;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Map;
import org.junit.Test;

public class CollectionsFunTest {

	@Test
	public void animalsAreSorted() {
		Map<String, String> map = CollectionsFun.getAnimals();
		String[] actual = map.keySet().toArray(new String[0]);
		assertEquals("[bear, rattlesnake, whale, zebra]", Arrays.toString(actual));
	}

}
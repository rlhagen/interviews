package com.interview.intern;

import java.util.HashMap;
import java.util.Map;

public class CollectionsFun {

	/**
	 * @return a Map of animals in alphabetical order
	 */
	public static Map<String, String> getAnimals() {
		Map<String, String> items = new HashMap<>();
		items.put("bear", "mammal");
		items.put("rattlesnake", "reptile");
		items.put("whale", "mammal");
		items.put("zebra", "mammal");
		return items;
	}

}

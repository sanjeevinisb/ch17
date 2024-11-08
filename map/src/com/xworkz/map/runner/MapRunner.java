package com.xworkz.map.runner;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapRunner {

	public static void main(String[] args) {

		// Mobile AND Email
		Map<String, Long> map = new HashMap<>();
		map.put("sanjeevini@gmail.com", 7795867455L);
		map.put("ashwini@gmail.com", 9487582133L);
		map.put("krishav@gmail.com", 9902484721L);
		map.put("sneha@gmail.com", 8088563251L);
		
		
		// Loop only keys
		Set<String> keys = map.keySet();
		keys.forEach(key -> System.out.println(key));
		
		
		// Loop only values
		Collection<Long> values = map.values();
		values.forEach(v -> System.out.println(v));

		
		// Loop all entries
		Set<Map.Entry<String, Long>> entries = map.entrySet();
		entries.forEach(entry -> System.out.println(entry.getKey() + ":" + entry.getValue()));

	}

}
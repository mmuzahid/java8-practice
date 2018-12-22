package me.practice.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

	public static void showAllExample() {
		System.out.println("\nStart StreamExample\n");
		showListStreamExample();
		System.out.println("\nEnd StreamExample\n");

	}

	private static void showListStreamExample() {
		List<String> strList = new ArrayList<>();
		strList.add("Python");
		strList.add("Php");
		strList.add("Java");

		Stream<String> jFilter = strList.stream().filter(str -> str.startsWith("J"));
		// streams are lazy; bellow elements will be considered in terminal operation
		strList.add("JavaScript");
		strList.add("JQuery");

		System.out.println("Elements start with 'J': " + Arrays.toString(jFilter.toArray()));

		Stream<String> strStream = strList.stream();
		System.out.println("First Element: " + strStream.findFirst().get());
		try {
			strStream.count();// will throw exception because 'strStream' already operated
		} catch (IllegalStateException ex) {
			System.out.println(ex);
		}

	}

}

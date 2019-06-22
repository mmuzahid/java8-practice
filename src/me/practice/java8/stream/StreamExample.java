package me.practice.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

	public static void showAllExample() {
		System.out.println("\nStart StreamExample\n");
		System.out.println("\n--------------\n");
		showListStreamExample();
		System.out.println("\n--------------\n");
		showMapStreamExample();
		System.out.println("\n--------------\n");
		showFilterStreamExample();
		System.out.println("\n--------------\n");
		showReduceStreamExample();
		System.out.println("\n--------------\n");
		showBuildInStreamExample();
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
			System.out.println("Example of IllegalStateException - " + ex);
		}
		
	}

	private static void showMapStreamExample() {
		int[] numbers = new int[] {1,2,3,4};
		System.out.println("numbers: " + Arrays.toString(numbers));
				
		// Map - Same number of element but changed Item content
		int[] numbersMultuplyByTwo = Arrays.stream(numbers).map(i -> i * 2).toArray();
		System.out.println("Map - multiply by two numbers: " + Arrays.toString(numbersMultuplyByTwo));
				
	}

	private static void showFilterStreamExample() {
		int[] numbers = new int[] {1,2,3,4};
		System.out.println("numbers: " + Arrays.toString(numbers));

		// Filter - Reduce number of content but unchanged Item content
		int[] filteredNumbers = Arrays.stream(numbers).filter(i -> i > 2).toArray();
		System.out.println("Filter - filtered greater than two numbers: " + Arrays.toString(filteredNumbers));
				
	}

	private static void showReduceStreamExample() {
		int[] numbers = new int[] {1,2,3,4};
		System.out.println("numbers: " + Arrays.toString(numbers));

		// Reduce - Aggregate to a Single Value
		int reducedByMultiply = Arrays.stream(numbers).reduce(1, (i, j) -> i * j);
		System.out.println("Reduce - reduced by multiply all elements: " + reducedByMultiply);
	}
	
	private static void showBuildInStreamExample() {
		int[] numbers = new int[] {1,2,3,4};
		System.out.println("numbers: " + Arrays.toString(numbers));

		// Build-In Sum
		int total = Arrays.stream(numbers).sum();
		System.out.println("build-in sum: " + total);
		
		System.out.println("build-in avg: " + Arrays.stream(numbers).average().getAsDouble());
		
	}

	
	public static void main(String ... args) {
		showAllExample();
	}
}

package me.practice.java8.forEach;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachExample {

	public static void showAllExample() {
		System.out.println("\nStart ForEachExample\n");
		showExampleForStringList();
		System.out.println("\nEnd ForEachExample\n");
	}

	public static void showExampleForStringList() {
		List<String> strList = new ArrayList<String>();
		strList.add("Java-8");
		strList.add("Python-3");
		strList.add("PHP-7");
		strList.add("Kotlin-1");

		System.out.println("Example: with Consumer........");
		strList.forEach(new Consumer<String>() {
			@Override
			public void accept(String str) {
				System.out.println(str.toLowerCase());
			}
		});

		System.out.println("Example: with Lambda........");
		strList.forEach(s-> System.out.println(s.toUpperCase()));
		
		System.out.println("Old For Each Loop........");
		for (String str : strList) {
			System.out.println(str);
		}
		
	}
}

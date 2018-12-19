package me.practice.java8;

import me.practice.java8.forEach.ForEachExample;
import me.practice.java8.functionalInterface.FunctionalInterfaceExample;
import me.practice.java8.interfaceDefaultMethod.InterfaceDefaultMethodExample;
import me.practice.java8.interfaceStaticMethod.InterfaceStaticMethodExample;

public class Main {

	public static void main(String[] args) {
		System.out.println("Typical 'Hello World'");
		
		ForEachExample.showAllExample();
		InterfaceDefaultMethodExample.showAllExample();
		InterfaceStaticMethodExample.showAllExample();
		FunctionalInterfaceExample.showAllExample();
	}

}

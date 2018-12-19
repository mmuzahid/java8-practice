package me.practice.java8.interfaceDefaultMethod;

public class InterfaceDefaultMethodExample {
	public static void showAllExample() {
		System.out.println("\nStart InterfaceDefaultMethodExample\n");
		showInterfaceDefaultMethodExample();
		System.out.println("\nEnd InterfaceDefaultMethodExample\n");
	}

	private static void showInterfaceDefaultMethodExample() {
		new SimpleBean().log();
		new AnotherSimpleBean().log();
	}
}

class SimpleBean implements InterfaceOne {
	
}

class AnotherSimpleBean implements InterfaceOne, InterfaceTwo {

	@Override
	public void log() {
		System.out.println("AnotherSimpleBean: log");
	}
	
}

package me.practice.java8.functionalInterface;

public class FunctionalInterfaceExample {
	public static void showAllExample() {
		System.out.println("\nStart FuntionalInterfaceExample\n");
		showInterfaceStaticMethodExample();
		System.out.println("\nEnd FuntionalInterfaceExample\n");
	}

	private static void showInterfaceStaticMethodExample() {
		new SimpleBean().runOnlyMethod();
	}
}

class SimpleBean implements SimpleFunctionalInterface {

	@Override
	public void runOnlyMethod() {
		System.out.println("run Only method of SimpleFunctionalInterface");
	}

}

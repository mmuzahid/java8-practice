package me.practice.java8.interfaceStaticMethod;

public class InterfaceStaticMethodExample {
	public static void showAllExample() {
		System.out.println("\nStart InterfaceStaticMethodExample\n");
		showInterfaceStaticMethodExample();
		System.out.println("\nEnd InterfaceStaticMethodExample\n");
	}

	private static void showInterfaceStaticMethodExample() {
		new SimpleBean().callInterfaceStaticMethod();
	}
}

class SimpleBean implements InterfaceWithStaticMethod {

	public void callInterfaceStaticMethod() {
		InterfaceWithStaticMethod.runStaticMethod();
	}
	
}

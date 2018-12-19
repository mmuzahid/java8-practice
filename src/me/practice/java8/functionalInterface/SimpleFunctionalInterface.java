package me.practice.java8.functionalInterface;

@FunctionalInterface
public interface SimpleFunctionalInterface {
	void runOnlyMethod();
	// void secondMethodCausesCompilationError();
	default void supportDefaultMethods() {}
	static void supportStaticMethods() {}
}

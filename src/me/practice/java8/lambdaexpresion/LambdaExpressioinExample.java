package me.practice.java8.lambdaexpresion;

public class LambdaExpressioinExample {

	public static void showAllExample() {
		System.out.println("\nStart LambdaExpressioinExample\n");
		showSingleLineLambdaExample();
		showMultiLineLambdaExample();
		showMethodBodyLambdaExample();
		System.out.println("\nEnd LambdaExpressioinExample\n");

	}

	private static void showSingleLineLambdaExample() {
		IntegerAdder intAdded = (a, b) -> a + b;
		System.out.printf("showSingleLineLambdaExample: %d + %d = %d\n", 5, 8, intAdded.add(5, 8));
	}

	private static void showMultiLineLambdaExample() {
		IntegerAdder intAdded = (a, b) -> {
			int c = a + b;
			return c;
		};
		System.out.printf("showMultiLineLambdaExample: %d + %d = %d\n", 7, 8, intAdded.add(7, 8));
	}

	private static void showMethodBodyLambdaExample() {
		IntegerAdder intAdded = (a, b) -> addInteger(a, b);
		System.out.printf("showMethodBodyLambdaExample: %d + %d = %d\n", 11, 19, intAdded.add(11, 19));
	}

	private static int addInteger(int a, int b) {
		int c = a + b;
		return c;
	}
	
}

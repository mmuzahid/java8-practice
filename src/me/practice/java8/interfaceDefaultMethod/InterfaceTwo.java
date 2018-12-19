package me.practice.java8.interfaceDefaultMethod;

public interface InterfaceTwo {
	default void log() {
		System.out.println("InterfaceTwo: log");
	}
}

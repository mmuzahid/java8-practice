package me.practice.java8.interfaceDefaultMethod;

public interface InterfaceOne {
	default void log() {
		System.out.println("InterfaceOne: log");
	}
}

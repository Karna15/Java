package java8.functions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
 * Functional interface
		A functional interface is an interface that contains only one abstract method. 
	They can have only one functionality to exhibit. 
	From Java 8 onwards, lambda expressions can be used to represent the instance of a functional interface. 
	A functional interface can have any number of default methods. 
	Runnable, ActionListener, Comparable are some of the examples of functional interfaces.

 * Points to remember
 	1. A functional interface has only one abstract method but it can have multiple default methods.
	2. @FunctionalInterface annotation is used to ensure an interface can’t have more than one abstract method. The use of this annotation is optional.
	3. The java.util.function package contains many built in functional interfaces in Java 8.
*/

/** Predicate Demo */
public class Functionalinterface {

    public static void main(String[] args) {

	List<String> list = Arrays.asList("Alex", "James", "Bale", "Fred");

	Predicate<String> p = (s) -> s.startsWith("J");

	for (String name : list) {
	    if (p.test(name))
		System.out.println(name);
	}

    }

}
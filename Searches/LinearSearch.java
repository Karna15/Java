package Searches;

import java.util.Random;
import java.util.stream.Stream;

public class LinearSearch {

    public static void main(String[] args) {

	Random r = new Random();
	int size = 200;
	int maxElement = 100;
	Integer[] integers = Stream.generate(() -> r.nextInt(maxElement)).limit(size).toArray(Integer[]::new);

	for (int i = 0; i < 5; i++) {
	    System.out.println(integers[i]);
	}

    }

}

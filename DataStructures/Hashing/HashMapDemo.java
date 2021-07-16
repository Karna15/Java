package DataStructures.Hashing;

/*
 * Map - HashMap
 * ------
 * 1. HashMap stores data in "key/value" pairs
 * 2. HashMap does not supports Insertion Order, values are stored in ascending order
 * 3. Does not support duplicate keys and duplicate null key values.
 * 4. Methods
 * - put -- add into HashMap
 * - get -- retrieve into HashMap
 * - ContainsKey, ContainsValue -- searches and returns true or not
 * - remove -- delete value from HashMap
 * - replace -- updates value in the HashMap
 */

import java.util.HashMap;

public class HashMapDemo {

	public static void HashMapExample() {

		HashMap<Integer, Integer> ref = new HashMap<Integer, Integer>();

		ref.put(1, 1);
		ref.put(4, 33);
		ref.put(3, 11);
		ref.put(5, 11);
		System.out.println(ref);
		
		ref.replace(3, 10);
		System.out.println(ref);
		System.out.println(ref.get(2)); // access an item with key value
		System.out.println(ref.containsKey(3)); // checks whether key exists
		ref.remove(1); // removes an item 
		System.out.println(ref.containsValue(11)); // checks whether value exists

		/** forEach */
		ref.forEach((k, v) -> System.out.println("Key: " + k + " - Value: " + v));

		/** Stream */
		ref.entrySet().stream().forEachOrdered((entry) -> {
			System.out.println(entry.getKey() + "=" + entry.getValue());
		});

		/** Parallel Stream */
		ref.entrySet().parallelStream().forEach((entry) -> {
			System.out.println(entry.getKey() + "=" + entry.getValue());
		});

	}

	public static void main(String[] args) {
		HashMapExample();
	}

}
